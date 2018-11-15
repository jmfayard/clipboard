## $HOME/.bash_profile
export DEV=$HOME/Dev
export JAVA_HOME="$(/usr/libexec/java_home -v 1.8)"

export EDITOR=vim
VISUAL=vim
which "$VISUAL" > /dev/null && export VISUAL

CONFIGFILE=$HOME/.bash_profile
config() {
	echo "Editing $CONFIGFILE"
	echo "$ reload  # when you are done"
	vim "$CONFIGFILE"
}
reload() {
	source $CONFIGFILE
}

try() {
	cd $HOME/Dev/try
	find $PWD -type d -maxdepth 1
}




# https://www.maketecheasier.com/8-useful-and-interesting-bash-prompts/
# https://gist.github.com/justintv/168835
#### Change terminal title
PROMPT_COMMAND='echo -ne "\033]0;${PWD}\007"'
### Add Git Status to bash prompt
parse_git_branch() {
     git branch 2> /dev/null | sed -e '/^[^*]/d' -e 's/* \(.*\)/ (\1)/'
}
export PS1="\n\[\033[32m\]\w\[\033[33m\]\$(parse_git_branch)\[\033[00m\] \n(\[\[\e[37;1m\]! \!\[\e[32;1m\])-> \[\e[0m\]"



#THIS MUST BE AT THE END OF THE FILE FOR SDKMAN TO WORK!!!
export SDKMAN_DIR="/Users/jmfayard/.sdkman"
[[ -s "/Users/jmfayard/.sdkman/bin/sdkman-init.sh" ]] && source "/Users/jmfayard/.sdkman/bin/sdkman-init.sh"
