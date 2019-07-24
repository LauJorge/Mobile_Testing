# Project set up

##### Get Android Studio set up
At https://developer.android.com/studio/index.html 
	download 	offline components - 	**Google Maven dependencies **

##### Setup Android Environment Variables
edit bash profile
`	'vi ~/.bash_profile'`

	export PATH="/usr/local/sbin:$PATH"
	export M2_HOME=/usr/local/apache-maven/apache-maven-3.3.1
	set M2_HOME=C:\Tools\apache-maven-3.3.1
	set MAVEN_OPTS=-Xms256m -Xmx1G
	export ANDROID_HOME=/Users/mjorge/Library/Android/sdk
	export ANDROID_SDK_ROOT=$ANDROID_HOME
	PATH=$PATH:$ANDROID_SDK_ROOT/tools/bin
	PATH=$PATH:$ANDROID_SDK_ROOT/emulator
	PATH=$PATH:$ANDROID_SDK_ROOT/platform-tools

	# to write and close: 	
	## ctrl + c
	## :wq!

##### Save bash profile
	'source .bash_profile'

##### Install Appium
- Download https://github.com/appium/appium-desktop/releases/tag/v1.14.0-beta.1
- Launch appium
- Start appium server

