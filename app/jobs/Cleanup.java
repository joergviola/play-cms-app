package jobs;

import models.cms.CMSImage;
import models.cms.CMSPage;
import play.Logger;
import play.jobs.Every;
import play.jobs.Job;
import play.jobs.OnApplicationStart;

@OnApplicationStart
@Every("1h")
public class Cleanup extends Job {
    public void doJob() {
    	Logger.info("Cleaning up CMS database.");
    	CMSPage.delete("1=1");
    	CMSImage.delete("1=1");
    	CMSPage home = new CMSPage();
    	home.name = "Home";
    	home.title = "Home";
    	home.active = true;
    	home.body = "<h1>Home</h1>This is the first CMS page. Feel free to edit.";
    	home.save();
    	CMSPage tagged1 = new CMSPage();
    	tagged1.name = "First";
    	tagged1.title = "First";
    	tagged1.tags = "index";
    	tagged1.sort = 1;
    	tagged1.active = true;
    	tagged1.body = "<h1>First</h1>This is the first CMS page in the front page enumeration. Feel free to edit.";
    	tagged1.save();
    	CMSPage tagged2 = new CMSPage();
    	tagged2.name = "Second";
    	tagged2.title = "Second";
    	tagged2.tags = "index";
    	tagged2.sort = 2;
    	tagged2.active = true;
    	tagged2.body = "<h1>First</h1>This is the second CMS page in the front page enumeration. Feel free to edit.";
    	tagged2.save();
    }
}
 
