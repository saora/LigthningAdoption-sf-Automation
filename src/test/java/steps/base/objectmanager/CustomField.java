package steps.base.objectmanager;

import net.serenitybdd.core.pages.PageObject;
import net.thucydides.core.annotations.Step;
import pages.BtnLinksActionsPage;
import pages.HomePage;
import steps.com.FieldData;
import steps.com.GetDataFromSpreadSheet;

public class CustomField extends PageObject {

   private HomePage homePage;
   private GetDataFromSpreadSheet actionData;
   private FieldData fieldData;
   private BtnLinksActionsPage btnLinksAction;

    @Step
    public void newCustomField(String obj){
        homePage.buildOption();
        homePage.selSalesforceObject(obj);
    }

    @Step
    public void fillFieldData()throws Exception{
        fieldData.setDataField();
        //actionData.setDatafield();
    }
}
