# first time
PROJECT="https://github.com/jmfayard/gradle-kotlin-dsl-libs"
BRANCH="$USER.playground"
# later
PROJECT=$( git remote -v | awk '/origin.*push/{print $0}' | awk '{print $2}' )
BRANCH=$( parse_git_branch )

export REPO=$( echo $PROJECT | awk -F '/' '{print $5}' )

# first time
open $PROJECT
git clone $PROJECT && cd $REPO 
git remote add $USER "https://github.com/$USER/$REPO"
git checkout -b $BRANCH
git push -u $USER




