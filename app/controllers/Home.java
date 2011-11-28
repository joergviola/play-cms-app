package controllers;

import play.*;
import play.mvc.*;

import java.util.*;

import models.*;
import models.cms.CMSPage;

public class Home extends Controller {

    public static void index() {
    	List<CMSPage> pages = CMSPage.findAll();
    	CMSPage page = null;
    	if (!pages.isEmpty())
    		page = pages.get(0);
        render(page);
    }
    

}