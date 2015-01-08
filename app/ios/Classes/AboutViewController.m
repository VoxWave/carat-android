//
//  AboutViewController.m
//  Carat
//
//  Created by Adam Oliner on 11/29/11.
//  Copyright (c) 2011 UC Berkeley. All rights reserved.
//

#import "AboutViewController.h"
#import "CoreDataManager.h"
#import "Utilities.h"
#import "CaratConstants.h"

@implementation AboutViewController

@synthesize aboutWebView;

- (id)initWithNibName:(NSString *)nibNameOrNil bundle:(NSBundle *)nibBundleOrNil
{
	self = [super initWithNibName:nibNameOrNil bundle:nibBundleOrNil];
	if (self) {
        self.title = @"About";
        self.tabBarItem.image = [UIImage imageNamed:@"about"];
    }
    return self;
}

- (void)didReceiveMemoryWarning
{
    DLog(@"Memory warning.");
    // Releases the view if it doesn't have a superview.
    [super didReceiveMemoryWarning];
}

#pragma mark - UIWebView

- (BOOL)webView:(UIWebView *)inWeb shouldStartLoadWithRequest:(NSURLRequest *)inRequest navigationType:(UIWebViewNavigationType)inType {
    if ( inType == UIWebViewNavigationTypeLinkClicked ) {
        [[UIApplication sharedApplication] openURL:[inRequest URL]];
        return NO;
    }
    
    return YES;
}

- (void)webView:(UIWebView *)wv didFailLoadWithError:(NSError *)error {
    // Ignore NSURLErrorDomain error -999.
    if (error.code == NSURLErrorCancelled) return;
    
    // Ignore "Fame Load Interrupted" errors. Seen after app store links.
    if (error.code == 102 && [error.domain isEqual:@"WebKitErrorDomain"]) return;
    
    // Normal error handling…
}

#pragma mark - View lifecycle

- (void)viewDidLoad
{
    [super viewDidLoad];
    // Do any additional setup after loading the view from its nib.
    for (UIWebView *wv in self.aboutWebView) {
        [wv loadRequest:[NSURLRequest requestWithURL:[NSURL fileURLWithPath:[[NSBundle mainBundle] pathForResource:@"about" ofType:@"html"] isDirectory:NO]]];
    }
}

- (void)viewDidUnload
{
    [aboutWebView release];
    [self setAboutWebView:nil];

    [super viewDidUnload];
    // Release any retained subviews of the main view.
    // e.g. self.myOutlet = nil;
}

- (void)viewWillAppear:(BOOL)animated
{
    [super viewWillAppear:animated];
    
    [[CoreDataManager instance] checkConnectivityAndSendStoredDataToServer];

	NSDictionary* userInfo = @{kPageTitle:@"About"};
	[[NSNotificationCenter defaultCenter] postNotificationName:kPageTitleUpdateNotification object:self userInfo:userInfo];

	NSDictionary *updatedXinfo = @{kUpdatedXAgo:@""};
	[[NSNotificationCenter defaultCenter] postNotificationName:kUpdatedXAgoUpdateNotification object:self userInfo:updatedXinfo];}

- (BOOL) shouldAutorotateToInterfaceOrientation:(UIInterfaceOrientation)orientation {
    return YES;
}

- (void)dealloc {
    [aboutWebView release];
    [super dealloc];
}
@end
