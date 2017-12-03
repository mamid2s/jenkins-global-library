package smacademy.git;

def gitCommit(gitPath) {
return "git --git-dir=${gitPath} rev-parse HEAD".execute().text
}
