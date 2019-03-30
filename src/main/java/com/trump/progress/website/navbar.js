const journalPageSrc = "JournalPage.html";
const progressBarPageSrc = "ProgressBarPage.html";
const tasksPageSrc = "TasksPage.html";
const userPageSrc = "UserPage.html";

function changePage (srcPage){
   parent.document.getElementById("mainContentFrame").src = srcPage;
}

function getJournalPageSrc(){
    return journalPageSrc;
}
function getProgressBarPageSrc(){
    return progressBarPageSrc;
}
function getTasksPageSrc(){
    return tasksPageSrc;
}
function getUserPageSrc(){
    return userPageSrc;
}

