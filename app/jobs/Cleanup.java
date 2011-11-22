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
    }
}
 
