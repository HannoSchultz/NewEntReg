/**
 * This class contains generated code from the Codename One Designer, DO NOT MODIFY!
 * This class is designed for subclassing that way the code generator can overwrite it
 * anytime without erasing your changes which should exist in a subclass!
 * For details about this file and how it works please read this blog post:
 * http://codenameone.blogspot.com/2010/10/ui-builder-class-how-to-actually-use.html
*/
package generated;

import com.codename1.ui.*;
import com.codename1.ui.util.*;
import com.codename1.ui.plaf.*;
import java.util.Hashtable;
import com.codename1.ui.events.*;

public abstract class StateMachineBase extends UIBuilder {
    private Container aboutToShowThisContainer;
    /**
     * this method should be used to initialize variables instead of
     * the constructor/class scope to avoid race conditions
     */
    /**
    * @deprecated use the version that accepts a resource as an argument instead
    
**/
    protected void initVars() {}

    protected void initVars(Resources res) {}

    public StateMachineBase(Resources res, String resPath, boolean loadTheme) {
        startApp(res, resPath, loadTheme);
    }

    public Container startApp(Resources res, String resPath, boolean loadTheme) {
        initVars();
        UIBuilder.registerCustomComponent("Container", com.codename1.ui.Container.class);
        UIBuilder.registerCustomComponent("Button", com.codename1.ui.Button.class);
        UIBuilder.registerCustomComponent("Form", com.codename1.ui.Form.class);
        UIBuilder.registerCustomComponent("CheckBox", com.codename1.ui.CheckBox.class);
        UIBuilder.registerCustomComponent("ComboBox", com.codename1.ui.ComboBox.class);
        UIBuilder.registerCustomComponent("Picker", com.codename1.ui.spinner.Picker.class);
        UIBuilder.registerCustomComponent("Label", com.codename1.ui.Label.class);
        UIBuilder.registerCustomComponent("Tabs", com.codename1.ui.Tabs.class);
        UIBuilder.registerCustomComponent("TextField", com.codename1.ui.TextField.class);
        UIBuilder.registerCustomComponent("SpanLabel", com.codename1.components.SpanLabel.class);
        if(loadTheme) {
            if(res == null) {
                try {
                    if(resPath.endsWith(".res")) {
                        res = Resources.open(resPath);
                        System.out.println("Warning: you should construct the state machine without the .res extension to allow theme overlays");
                    } else {
                        res = Resources.openLayered(resPath);
                    }
                } catch(java.io.IOException err) { err.printStackTrace(); }
            }
            initTheme(res);
        }
        if(res != null) {
            setResourceFilePath(resPath);
            setResourceFile(res);
            initVars(res);
            return showForm(getFirstFormName(), null);
        } else {
            Form f = (Form)createContainer(resPath, getFirstFormName());
            initVars(fetchResourceFile());
            beforeShow(f);
            f.show();
            postShow(f);
            return f;
        }
    }

    protected String getFirstFormName() {
        return "Main";
    }

    public Container createWidget(Resources res, String resPath, boolean loadTheme) {
        initVars();
        UIBuilder.registerCustomComponent("Container", com.codename1.ui.Container.class);
        UIBuilder.registerCustomComponent("Button", com.codename1.ui.Button.class);
        UIBuilder.registerCustomComponent("Form", com.codename1.ui.Form.class);
        UIBuilder.registerCustomComponent("CheckBox", com.codename1.ui.CheckBox.class);
        UIBuilder.registerCustomComponent("ComboBox", com.codename1.ui.ComboBox.class);
        UIBuilder.registerCustomComponent("Picker", com.codename1.ui.spinner.Picker.class);
        UIBuilder.registerCustomComponent("Label", com.codename1.ui.Label.class);
        UIBuilder.registerCustomComponent("Tabs", com.codename1.ui.Tabs.class);
        UIBuilder.registerCustomComponent("TextField", com.codename1.ui.TextField.class);
        UIBuilder.registerCustomComponent("SpanLabel", com.codename1.components.SpanLabel.class);
        if(loadTheme) {
            if(res == null) {
                try {
                    res = Resources.openLayered(resPath);
                } catch(java.io.IOException err) { err.printStackTrace(); }
            }
            initTheme(res);
        }
        return createContainer(resPath, "Main");
    }

    protected void initTheme(Resources res) {
            String[] themes = res.getThemeResourceNames();
            if(themes != null && themes.length > 0) {
                UIManager.getInstance().setThemeProps(res.getTheme(themes[0]));
            }
    }

    public StateMachineBase() {
    }

    public StateMachineBase(String resPath) {
        this(null, resPath, true);
    }

    public StateMachineBase(Resources res) {
        this(res, null, true);
    }

    public StateMachineBase(String resPath, boolean loadTheme) {
        this(null, resPath, loadTheme);
    }

    public StateMachineBase(Resources res, boolean loadTheme) {
        this(res, null, loadTheme);
    }

    public com.codename1.ui.Label findLabel11(Component root) {
        return (com.codename1.ui.Label)findByName("Label11", root);
    }

    public com.codename1.ui.Label findLabel11() {
        com.codename1.ui.Label cmp = (com.codename1.ui.Label)findByName("Label11", Display.getInstance().getCurrent());
        if(cmp == null && aboutToShowThisContainer != null) {
            cmp = (com.codename1.ui.Label)findByName("Label11", aboutToShowThisContainer);
        }
        return cmp;
    }

    public com.codename1.ui.Label findLabel12(Component root) {
        return (com.codename1.ui.Label)findByName("Label12", root);
    }

    public com.codename1.ui.Label findLabel12() {
        com.codename1.ui.Label cmp = (com.codename1.ui.Label)findByName("Label12", Display.getInstance().getCurrent());
        if(cmp == null && aboutToShowThisContainer != null) {
            cmp = (com.codename1.ui.Label)findByName("Label12", aboutToShowThisContainer);
        }
        return cmp;
    }

    public com.codename1.ui.TextField findTxtCell(Component root) {
        return (com.codename1.ui.TextField)findByName("TxtCell", root);
    }

    public com.codename1.ui.TextField findTxtCell() {
        com.codename1.ui.TextField cmp = (com.codename1.ui.TextField)findByName("TxtCell", Display.getInstance().getCurrent());
        if(cmp == null && aboutToShowThisContainer != null) {
            cmp = (com.codename1.ui.TextField)findByName("TxtCell", aboutToShowThisContainer);
        }
        return cmp;
    }

    public com.codename1.ui.ComboBox findCmbentPostalPr(Component root) {
        return (com.codename1.ui.ComboBox)findByName("CmbentPostalPr", root);
    }

    public com.codename1.ui.ComboBox findCmbentPostalPr() {
        com.codename1.ui.ComboBox cmp = (com.codename1.ui.ComboBox)findByName("CmbentPostalPr", Display.getInstance().getCurrent());
        if(cmp == null && aboutToShowThisContainer != null) {
            cmp = (com.codename1.ui.ComboBox)findByName("CmbentPostalPr", aboutToShowThisContainer);
        }
        return cmp;
    }

    public com.codename1.ui.Label findLabel13(Component root) {
        return (com.codename1.ui.Label)findByName("Label13", root);
    }

    public com.codename1.ui.Label findLabel13() {
        com.codename1.ui.Label cmp = (com.codename1.ui.Label)findByName("Label13", Display.getInstance().getCurrent());
        if(cmp == null && aboutToShowThisContainer != null) {
            cmp = (com.codename1.ui.Label)findByName("Label13", aboutToShowThisContainer);
        }
        return cmp;
    }

    public com.codename1.ui.Label findLabel14(Component root) {
        return (com.codename1.ui.Label)findByName("Label14", root);
    }

    public com.codename1.ui.Label findLabel14() {
        com.codename1.ui.Label cmp = (com.codename1.ui.Label)findByName("Label14", Display.getInstance().getCurrent());
        if(cmp == null && aboutToShowThisContainer != null) {
            cmp = (com.codename1.ui.Label)findByName("Label14", aboutToShowThisContainer);
        }
        return cmp;
    }

    public com.codename1.ui.Label findLabel10(Component root) {
        return (com.codename1.ui.Label)findByName("Label10", root);
    }

    public com.codename1.ui.Label findLabel10() {
        com.codename1.ui.Label cmp = (com.codename1.ui.Label)findByName("Label10", Display.getInstance().getCurrent());
        if(cmp == null && aboutToShowThisContainer != null) {
            cmp = (com.codename1.ui.Label)findByName("Label10", aboutToShowThisContainer);
        }
        return cmp;
    }

    public com.codename1.ui.Label findLblName1Response(Component root) {
        return (com.codename1.ui.Label)findByName("lblName1Response", root);
    }

    public com.codename1.ui.Label findLblName1Response() {
        com.codename1.ui.Label cmp = (com.codename1.ui.Label)findByName("lblName1Response", Display.getInstance().getCurrent());
        if(cmp == null && aboutToShowThisContainer != null) {
            cmp = (com.codename1.ui.Label)findByName("lblName1Response", aboutToShowThisContainer);
        }
        return cmp;
    }

    public com.codename1.ui.Label findLabel(Component root) {
        return (com.codename1.ui.Label)findByName("Label", root);
    }

    public com.codename1.ui.Label findLabel() {
        com.codename1.ui.Label cmp = (com.codename1.ui.Label)findByName("Label", Display.getInstance().getCurrent());
        if(cmp == null && aboutToShowThisContainer != null) {
            cmp = (com.codename1.ui.Label)findByName("Label", aboutToShowThisContainer);
        }
        return cmp;
    }

    public com.codename1.ui.Container findContainer2(Component root) {
        return (com.codename1.ui.Container)findByName("Container2", root);
    }

    public com.codename1.ui.Container findContainer2() {
        com.codename1.ui.Container cmp = (com.codename1.ui.Container)findByName("Container2", Display.getInstance().getCurrent());
        if(cmp == null && aboutToShowThisContainer != null) {
            cmp = (com.codename1.ui.Container)findByName("Container2", aboutToShowThisContainer);
        }
        return cmp;
    }

    public com.codename1.ui.Label findLabel15(Component root) {
        return (com.codename1.ui.Label)findByName("Label15", root);
    }

    public com.codename1.ui.Label findLabel15() {
        com.codename1.ui.Label cmp = (com.codename1.ui.Label)findByName("Label15", Display.getInstance().getCurrent());
        if(cmp == null && aboutToShowThisContainer != null) {
            cmp = (com.codename1.ui.Label)findByName("Label15", aboutToShowThisContainer);
        }
        return cmp;
    }

    public com.codename1.ui.TextField findTxtPostalcode(Component root) {
        return (com.codename1.ui.TextField)findByName("TxtPostalcode", root);
    }

    public com.codename1.ui.TextField findTxtPostalcode() {
        com.codename1.ui.TextField cmp = (com.codename1.ui.TextField)findByName("TxtPostalcode", Display.getInstance().getCurrent());
        if(cmp == null && aboutToShowThisContainer != null) {
            cmp = (com.codename1.ui.TextField)findByName("TxtPostalcode", aboutToShowThisContainer);
        }
        return cmp;
    }

    public com.codename1.ui.Container findContDateofBirth(Component root) {
        return (com.codename1.ui.Container)findByName("ContDateofBirth", root);
    }

    public com.codename1.ui.Container findContDateofBirth() {
        com.codename1.ui.Container cmp = (com.codename1.ui.Container)findByName("ContDateofBirth", Display.getInstance().getCurrent());
        if(cmp == null && aboutToShowThisContainer != null) {
            cmp = (com.codename1.ui.Container)findByName("ContDateofBirth", aboutToShowThisContainer);
        }
        return cmp;
    }

    public com.codename1.ui.Container findConApprovedName(Component root) {
        return (com.codename1.ui.Container)findByName("ConApprovedName", root);
    }

    public com.codename1.ui.Container findConApprovedName() {
        com.codename1.ui.Container cmp = (com.codename1.ui.Container)findByName("ConApprovedName", Display.getInstance().getCurrent());
        if(cmp == null && aboutToShowThisContainer != null) {
            cmp = (com.codename1.ui.Container)findByName("ConApprovedName", aboutToShowThisContainer);
        }
        return cmp;
    }

    public com.codename1.ui.Label findLabel16(Component root) {
        return (com.codename1.ui.Label)findByName("Label16", root);
    }

    public com.codename1.ui.Label findLabel16() {
        com.codename1.ui.Label cmp = (com.codename1.ui.Label)findByName("Label16", Display.getInstance().getCurrent());
        if(cmp == null && aboutToShowThisContainer != null) {
            cmp = (com.codename1.ui.Label)findByName("Label16", aboutToShowThisContainer);
        }
        return cmp;
    }

    public com.codename1.ui.Container findConPhysAddress(Component root) {
        return (com.codename1.ui.Container)findByName("ConPhysAddress", root);
    }

    public com.codename1.ui.Container findConPhysAddress() {
        com.codename1.ui.Container cmp = (com.codename1.ui.Container)findByName("ConPhysAddress", Display.getInstance().getCurrent());
        if(cmp == null && aboutToShowThisContainer != null) {
            cmp = (com.codename1.ui.Container)findByName("ConPhysAddress", aboutToShowThisContainer);
        }
        return cmp;
    }

    public com.codename1.ui.Container findContainer(Component root) {
        return (com.codename1.ui.Container)findByName("Container", root);
    }

    public com.codename1.ui.Container findContainer() {
        com.codename1.ui.Container cmp = (com.codename1.ui.Container)findByName("Container", Display.getInstance().getCurrent());
        if(cmp == null && aboutToShowThisContainer != null) {
            cmp = (com.codename1.ui.Container)findByName("Container", aboutToShowThisContainer);
        }
        return cmp;
    }

    public com.codename1.ui.Label findLblNames(Component root) {
        return (com.codename1.ui.Label)findByName("LblNames", root);
    }

    public com.codename1.ui.Label findLblNames() {
        com.codename1.ui.Label cmp = (com.codename1.ui.Label)findByName("LblNames", Display.getInstance().getCurrent());
        if(cmp == null && aboutToShowThisContainer != null) {
            cmp = (com.codename1.ui.Label)findByName("LblNames", aboutToShowThisContainer);
        }
        return cmp;
    }

    public com.codename1.ui.Button findBtnAddDirector(Component root) {
        return (com.codename1.ui.Button)findByName("BtnAddDirector", root);
    }

    public com.codename1.ui.Button findBtnAddDirector() {
        com.codename1.ui.Button cmp = (com.codename1.ui.Button)findByName("BtnAddDirector", Display.getInstance().getCurrent());
        if(cmp == null && aboutToShowThisContainer != null) {
            cmp = (com.codename1.ui.Button)findByName("BtnAddDirector", aboutToShowThisContainer);
        }
        return cmp;
    }

    public com.codename1.ui.Container findConFye(Component root) {
        return (com.codename1.ui.Container)findByName("ConFye", root);
    }

    public com.codename1.ui.Container findConFye() {
        com.codename1.ui.Container cmp = (com.codename1.ui.Container)findByName("ConFye", Display.getInstance().getCurrent());
        if(cmp == null && aboutToShowThisContainer != null) {
            cmp = (com.codename1.ui.Container)findByName("ConFye", aboutToShowThisContainer);
        }
        return cmp;
    }

    public com.codename1.ui.Button findButton(Component root) {
        return (com.codename1.ui.Button)findByName("Button", root);
    }

    public com.codename1.ui.Button findButton() {
        com.codename1.ui.Button cmp = (com.codename1.ui.Button)findByName("Button", Display.getInstance().getCurrent());
        if(cmp == null && aboutToShowThisContainer != null) {
            cmp = (com.codename1.ui.Button)findByName("Button", aboutToShowThisContainer);
        }
        return cmp;
    }

    public com.codename1.ui.CheckBox findChBSubmitNameReservation(Component root) {
        return (com.codename1.ui.CheckBox)findByName("ChBSubmitNameReservation", root);
    }

    public com.codename1.ui.CheckBox findChBSubmitNameReservation() {
        com.codename1.ui.CheckBox cmp = (com.codename1.ui.CheckBox)findByName("ChBSubmitNameReservation", Display.getInstance().getCurrent());
        if(cmp == null && aboutToShowThisContainer != null) {
            cmp = (com.codename1.ui.CheckBox)findByName("ChBSubmitNameReservation", aboutToShowThisContainer);
        }
        return cmp;
    }

    public com.codename1.ui.Container findConIDandnames(Component root) {
        return (com.codename1.ui.Container)findByName("ConIDandnames", root);
    }

    public com.codename1.ui.Container findConIDandnames() {
        com.codename1.ui.Container cmp = (com.codename1.ui.Container)findByName("ConIDandnames", Display.getInstance().getCurrent());
        if(cmp == null && aboutToShowThisContainer != null) {
            cmp = (com.codename1.ui.Container)findByName("ConIDandnames", aboutToShowThisContainer);
        }
        return cmp;
    }

    public com.codename1.ui.spinner.Picker findDtAppDate(Component root) {
        return (com.codename1.ui.spinner.Picker)findByName("dtAppDate", root);
    }

    public com.codename1.ui.spinner.Picker findDtAppDate() {
        com.codename1.ui.spinner.Picker cmp = (com.codename1.ui.spinner.Picker)findByName("dtAppDate", Display.getInstance().getCurrent());
        if(cmp == null && aboutToShowThisContainer != null) {
            cmp = (com.codename1.ui.spinner.Picker)findByName("dtAppDate", aboutToShowThisContainer);
        }
        return cmp;
    }

    public com.codename1.ui.ComboBox findCmbPostalProvince(Component root) {
        return (com.codename1.ui.ComboBox)findByName("CmbPostalProvince", root);
    }

    public com.codename1.ui.ComboBox findCmbPostalProvince() {
        com.codename1.ui.ComboBox cmp = (com.codename1.ui.ComboBox)findByName("CmbPostalProvince", Display.getInstance().getCurrent());
        if(cmp == null && aboutToShowThisContainer != null) {
            cmp = (com.codename1.ui.ComboBox)findByName("CmbPostalProvince", aboutToShowThisContainer);
        }
        return cmp;
    }

    public com.codename1.ui.Label findLblSurname(Component root) {
        return (com.codename1.ui.Label)findByName("LblSurname", root);
    }

    public com.codename1.ui.Label findLblSurname() {
        com.codename1.ui.Label cmp = (com.codename1.ui.Label)findByName("LblSurname", Display.getInstance().getCurrent());
        if(cmp == null && aboutToShowThisContainer != null) {
            cmp = (com.codename1.ui.Label)findByName("LblSurname", aboutToShowThisContainer);
        }
        return cmp;
    }

    public com.codename1.ui.Container findContAutShares(Component root) {
        return (com.codename1.ui.Container)findByName("ContAutShares", root);
    }

    public com.codename1.ui.Container findContAutShares() {
        com.codename1.ui.Container cmp = (com.codename1.ui.Container)findByName("ContAutShares", Display.getInstance().getCurrent());
        if(cmp == null && aboutToShowThisContainer != null) {
            cmp = (com.codename1.ui.Container)findByName("ContAutShares", aboutToShowThisContainer);
        }
        return cmp;
    }

    public com.codename1.ui.Button findBtnvalno(Component root) {
        return (com.codename1.ui.Button)findByName("btnvalno", root);
    }

    public com.codename1.ui.Button findBtnvalno() {
        com.codename1.ui.Button cmp = (com.codename1.ui.Button)findByName("btnvalno", Display.getInstance().getCurrent());
        if(cmp == null && aboutToShowThisContainer != null) {
            cmp = (com.codename1.ui.Button)findByName("btnvalno", aboutToShowThisContainer);
        }
        return cmp;
    }

    public com.codename1.ui.CheckBox findChbIssameasPhys(Component root) {
        return (com.codename1.ui.CheckBox)findByName("ChbIssameasPhys", root);
    }

    public com.codename1.ui.CheckBox findChbIssameasPhys() {
        com.codename1.ui.CheckBox cmp = (com.codename1.ui.CheckBox)findByName("ChbIssameasPhys", Display.getInstance().getCurrent());
        if(cmp == null && aboutToShowThisContainer != null) {
            cmp = (com.codename1.ui.CheckBox)findByName("ChbIssameasPhys", aboutToShowThisContainer);
        }
        return cmp;
    }

    public com.codename1.ui.Button findBtnFileName(Component root) {
        return (com.codename1.ui.Button)findByName("BtnFileName", root);
    }

    public com.codename1.ui.Button findBtnFileName() {
        com.codename1.ui.Button cmp = (com.codename1.ui.Button)findByName("BtnFileName", Display.getInstance().getCurrent());
        if(cmp == null && aboutToShowThisContainer != null) {
            cmp = (com.codename1.ui.Button)findByName("BtnFileName", aboutToShowThisContainer);
        }
        return cmp;
    }

    public com.codename1.ui.CheckBox findChbBaddresssame(Component root) {
        return (com.codename1.ui.CheckBox)findByName("ChbBaddresssame", root);
    }

    public com.codename1.ui.CheckBox findChbBaddresssame() {
        com.codename1.ui.CheckBox cmp = (com.codename1.ui.CheckBox)findByName("ChbBaddresssame", Display.getInstance().getCurrent());
        if(cmp == null && aboutToShowThisContainer != null) {
            cmp = (com.codename1.ui.CheckBox)findByName("ChbBaddresssame", aboutToShowThisContainer);
        }
        return cmp;
    }

    public com.codename1.components.SpanLabel findSpanLabel(Component root) {
        return (com.codename1.components.SpanLabel)findByName("SpanLabel", root);
    }

    public com.codename1.components.SpanLabel findSpanLabel() {
        com.codename1.components.SpanLabel cmp = (com.codename1.components.SpanLabel)findByName("SpanLabel", Display.getInstance().getCurrent());
        if(cmp == null && aboutToShowThisContainer != null) {
            cmp = (com.codename1.components.SpanLabel)findByName("SpanLabel", aboutToShowThisContainer);
        }
        return cmp;
    }

    public com.codename1.ui.TextField findPhysaddrcode(Component root) {
        return (com.codename1.ui.TextField)findByName("Physaddrcode", root);
    }

    public com.codename1.ui.TextField findPhysaddrcode() {
        com.codename1.ui.TextField cmp = (com.codename1.ui.TextField)findByName("Physaddrcode", Display.getInstance().getCurrent());
        if(cmp == null && aboutToShowThisContainer != null) {
            cmp = (com.codename1.ui.TextField)findByName("Physaddrcode", aboutToShowThisContainer);
        }
        return cmp;
    }

    public com.codename1.ui.Container findConEmail(Component root) {
        return (com.codename1.ui.Container)findByName("ConEmail", root);
    }

    public com.codename1.ui.Container findConEmail() {
        com.codename1.ui.Container cmp = (com.codename1.ui.Container)findByName("ConEmail", Display.getInstance().getCurrent());
        if(cmp == null && aboutToShowThisContainer != null) {
            cmp = (com.codename1.ui.Container)findByName("ConEmail", aboutToShowThisContainer);
        }
        return cmp;
    }

    public com.codename1.ui.CheckBox findChkBApprovedName(Component root) {
        return (com.codename1.ui.CheckBox)findByName("ChkBApprovedName", root);
    }

    public com.codename1.ui.CheckBox findChkBApprovedName() {
        com.codename1.ui.CheckBox cmp = (com.codename1.ui.CheckBox)findByName("ChkBApprovedName", Display.getInstance().getCurrent());
        if(cmp == null && aboutToShowThisContainer != null) {
            cmp = (com.codename1.ui.CheckBox)findByName("ChkBApprovedName", aboutToShowThisContainer);
        }
        return cmp;
    }

    public com.codename1.ui.Label findLblName3Response(Component root) {
        return (com.codename1.ui.Label)findByName("lblName3Response", root);
    }

    public com.codename1.ui.Label findLblName3Response() {
        com.codename1.ui.Label cmp = (com.codename1.ui.Label)findByName("lblName3Response", Display.getInstance().getCurrent());
        if(cmp == null && aboutToShowThisContainer != null) {
            cmp = (com.codename1.ui.Label)findByName("lblName3Response", aboutToShowThisContainer);
        }
        return cmp;
    }

    public com.codename1.ui.Container findConPostalAddress(Component root) {
        return (com.codename1.ui.Container)findByName("ConPostalAddress", root);
    }

    public com.codename1.ui.Container findConPostalAddress() {
        com.codename1.ui.Container cmp = (com.codename1.ui.Container)findByName("ConPostalAddress", Display.getInstance().getCurrent());
        if(cmp == null && aboutToShowThisContainer != null) {
            cmp = (com.codename1.ui.Container)findByName("ConPostalAddress", aboutToShowThisContainer);
        }
        return cmp;
    }

    public com.codename1.ui.CheckBox findCheckBox(Component root) {
        return (com.codename1.ui.CheckBox)findByName("CheckBox", root);
    }

    public com.codename1.ui.CheckBox findCheckBox() {
        com.codename1.ui.CheckBox cmp = (com.codename1.ui.CheckBox)findByName("CheckBox", Display.getInstance().getCurrent());
        if(cmp == null && aboutToShowThisContainer != null) {
            cmp = (com.codename1.ui.CheckBox)findByName("CheckBox", aboutToShowThisContainer);
        }
        return cmp;
    }

    public com.codename1.ui.Label findLbLNameResNo(Component root) {
        return (com.codename1.ui.Label)findByName("LbLNameResNo", root);
    }

    public com.codename1.ui.Label findLbLNameResNo() {
        com.codename1.ui.Label cmp = (com.codename1.ui.Label)findByName("LbLNameResNo", Display.getInstance().getCurrent());
        if(cmp == null && aboutToShowThisContainer != null) {
            cmp = (com.codename1.ui.Label)findByName("LbLNameResNo", aboutToShowThisContainer);
        }
        return cmp;
    }

    public com.codename1.ui.ComboBox findCmbProvince(Component root) {
        return (com.codename1.ui.ComboBox)findByName("CmbProvince", root);
    }

    public com.codename1.ui.ComboBox findCmbProvince() {
        com.codename1.ui.ComboBox cmp = (com.codename1.ui.ComboBox)findByName("CmbProvince", Display.getInstance().getCurrent());
        if(cmp == null && aboutToShowThisContainer != null) {
            cmp = (com.codename1.ui.ComboBox)findByName("CmbProvince", aboutToShowThisContainer);
        }
        return cmp;
    }

    public com.codename1.ui.Tabs findTabs(Component root) {
        return (com.codename1.ui.Tabs)findByName("Tabs", root);
    }

    public com.codename1.ui.Tabs findTabs() {
        com.codename1.ui.Tabs cmp = (com.codename1.ui.Tabs)findByName("Tabs", Display.getInstance().getCurrent());
        if(cmp == null && aboutToShowThisContainer != null) {
            cmp = (com.codename1.ui.Tabs)findByName("Tabs", aboutToShowThisContainer);
        }
        return cmp;
    }

    public com.codename1.ui.Container findConCell(Component root) {
        return (com.codename1.ui.Container)findByName("ConCell", root);
    }

    public com.codename1.ui.Container findConCell() {
        com.codename1.ui.Container cmp = (com.codename1.ui.Container)findByName("ConCell", Display.getInstance().getCurrent());
        if(cmp == null && aboutToShowThisContainer != null) {
            cmp = (com.codename1.ui.Container)findByName("ConCell", aboutToShowThisContainer);
        }
        return cmp;
    }

    public com.codename1.ui.TextField findTxtname3(Component root) {
        return (com.codename1.ui.TextField)findByName("Txtname3", root);
    }

    public com.codename1.ui.TextField findTxtname3() {
        com.codename1.ui.TextField cmp = (com.codename1.ui.TextField)findByName("Txtname3", Display.getInstance().getCurrent());
        if(cmp == null && aboutToShowThisContainer != null) {
            cmp = (com.codename1.ui.TextField)findByName("Txtname3", aboutToShowThisContainer);
        }
        return cmp;
    }

    public com.codename1.ui.TextField findTxtname4(Component root) {
        return (com.codename1.ui.TextField)findByName("Txtname4", root);
    }

    public com.codename1.ui.TextField findTxtname4() {
        com.codename1.ui.TextField cmp = (com.codename1.ui.TextField)findByName("Txtname4", Display.getInstance().getCurrent());
        if(cmp == null && aboutToShowThisContainer != null) {
            cmp = (com.codename1.ui.TextField)findByName("Txtname4", aboutToShowThisContainer);
        }
        return cmp;
    }

    public com.codename1.ui.TextField findTxtAuthShares(Component root) {
        return (com.codename1.ui.TextField)findByName("TxtAuthShares", root);
    }

    public com.codename1.ui.TextField findTxtAuthShares() {
        com.codename1.ui.TextField cmp = (com.codename1.ui.TextField)findByName("TxtAuthShares", Display.getInstance().getCurrent());
        if(cmp == null && aboutToShowThisContainer != null) {
            cmp = (com.codename1.ui.TextField)findByName("TxtAuthShares", aboutToShowThisContainer);
        }
        return cmp;
    }

    public com.codename1.ui.TextField findTxtPhysAddr3(Component root) {
        return (com.codename1.ui.TextField)findByName("txtPhysAddr3", root);
    }

    public com.codename1.ui.TextField findTxtPhysAddr3() {
        com.codename1.ui.TextField cmp = (com.codename1.ui.TextField)findByName("txtPhysAddr3", Display.getInstance().getCurrent());
        if(cmp == null && aboutToShowThisContainer != null) {
            cmp = (com.codename1.ui.TextField)findByName("txtPhysAddr3", aboutToShowThisContainer);
        }
        return cmp;
    }

    public com.codename1.ui.TextField findTxtname1(Component root) {
        return (com.codename1.ui.TextField)findByName("Txtname1", root);
    }

    public com.codename1.ui.TextField findTxtname1() {
        com.codename1.ui.TextField cmp = (com.codename1.ui.TextField)findByName("Txtname1", Display.getInstance().getCurrent());
        if(cmp == null && aboutToShowThisContainer != null) {
            cmp = (com.codename1.ui.TextField)findByName("Txtname1", aboutToShowThisContainer);
        }
        return cmp;
    }

    public com.codename1.ui.TextField findTxtPhysCode(Component root) {
        return (com.codename1.ui.TextField)findByName("txtPhysCode", root);
    }

    public com.codename1.ui.TextField findTxtPhysCode() {
        com.codename1.ui.TextField cmp = (com.codename1.ui.TextField)findByName("txtPhysCode", Display.getInstance().getCurrent());
        if(cmp == null && aboutToShowThisContainer != null) {
            cmp = (com.codename1.ui.TextField)findByName("txtPhysCode", aboutToShowThisContainer);
        }
        return cmp;
    }

    public com.codename1.ui.TextField findTxtname2(Component root) {
        return (com.codename1.ui.TextField)findByName("Txtname2", root);
    }

    public com.codename1.ui.TextField findTxtname2() {
        com.codename1.ui.TextField cmp = (com.codename1.ui.TextField)findByName("Txtname2", Display.getInstance().getCurrent());
        if(cmp == null && aboutToShowThisContainer != null) {
            cmp = (com.codename1.ui.TextField)findByName("Txtname2", aboutToShowThisContainer);
        }
        return cmp;
    }

    public com.codename1.ui.Container findConPhysAddr(Component root) {
        return (com.codename1.ui.Container)findByName("ConPhysAddr", root);
    }

    public com.codename1.ui.Container findConPhysAddr() {
        com.codename1.ui.Container cmp = (com.codename1.ui.Container)findByName("ConPhysAddr", Display.getInstance().getCurrent());
        if(cmp == null && aboutToShowThisContainer != null) {
            cmp = (com.codename1.ui.Container)findByName("ConPhysAddr", aboutToShowThisContainer);
        }
        return cmp;
    }

    public com.codename1.ui.Button findBtnStartNewReg(Component root) {
        return (com.codename1.ui.Button)findByName("BtnStartNewReg", root);
    }

    public com.codename1.ui.Button findBtnStartNewReg() {
        com.codename1.ui.Button cmp = (com.codename1.ui.Button)findByName("BtnStartNewReg", Display.getInstance().getCurrent());
        if(cmp == null && aboutToShowThisContainer != null) {
            cmp = (com.codename1.ui.Button)findByName("BtnStartNewReg", aboutToShowThisContainer);
        }
        return cmp;
    }

    public com.codename1.ui.Label findLblApprovedName(Component root) {
        return (com.codename1.ui.Label)findByName("LblApprovedName", root);
    }

    public com.codename1.ui.Label findLblApprovedName() {
        com.codename1.ui.Label cmp = (com.codename1.ui.Label)findByName("LblApprovedName", Display.getInstance().getCurrent());
        if(cmp == null && aboutToShowThisContainer != null) {
            cmp = (com.codename1.ui.Label)findByName("LblApprovedName", aboutToShowThisContainer);
        }
        return cmp;
    }

    public com.codename1.ui.Label findLblName2Response(Component root) {
        return (com.codename1.ui.Label)findByName("lblName2Response", root);
    }

    public com.codename1.ui.Label findLblName2Response() {
        com.codename1.ui.Label cmp = (com.codename1.ui.Label)findByName("lblName2Response", Display.getInstance().getCurrent());
        if(cmp == null && aboutToShowThisContainer != null) {
            cmp = (com.codename1.ui.Label)findByName("lblName2Response", aboutToShowThisContainer);
        }
        return cmp;
    }

    public com.codename1.ui.Label findLabel9(Component root) {
        return (com.codename1.ui.Label)findByName("Label9", root);
    }

    public com.codename1.ui.Label findLabel9() {
        com.codename1.ui.Label cmp = (com.codename1.ui.Label)findByName("Label9", Display.getInstance().getCurrent());
        if(cmp == null && aboutToShowThisContainer != null) {
            cmp = (com.codename1.ui.Label)findByName("Label9", aboutToShowThisContainer);
        }
        return cmp;
    }

    public com.codename1.ui.Label findLabel8(Component root) {
        return (com.codename1.ui.Label)findByName("Label8", root);
    }

    public com.codename1.ui.Label findLabel8() {
        com.codename1.ui.Label cmp = (com.codename1.ui.Label)findByName("Label8", Display.getInstance().getCurrent());
        if(cmp == null && aboutToShowThisContainer != null) {
            cmp = (com.codename1.ui.Label)findByName("Label8", aboutToShowThisContainer);
        }
        return cmp;
    }

    public com.codename1.ui.Container findConAppointDate(Component root) {
        return (com.codename1.ui.Container)findByName("ConAppointDate", root);
    }

    public com.codename1.ui.Container findConAppointDate() {
        com.codename1.ui.Container cmp = (com.codename1.ui.Container)findByName("ConAppointDate", Display.getInstance().getCurrent());
        if(cmp == null && aboutToShowThisContainer != null) {
            cmp = (com.codename1.ui.Container)findByName("ConAppointDate", aboutToShowThisContainer);
        }
        return cmp;
    }

    public com.codename1.ui.TextField findTxtPostaladdr3(Component root) {
        return (com.codename1.ui.TextField)findByName("TxtPostaladdr3", root);
    }

    public com.codename1.ui.TextField findTxtPostaladdr3() {
        com.codename1.ui.TextField cmp = (com.codename1.ui.TextField)findByName("TxtPostaladdr3", Display.getInstance().getCurrent());
        if(cmp == null && aboutToShowThisContainer != null) {
            cmp = (com.codename1.ui.TextField)findByName("TxtPostaladdr3", aboutToShowThisContainer);
        }
        return cmp;
    }

    public com.codename1.ui.Label findLabel5(Component root) {
        return (com.codename1.ui.Label)findByName("Label5", root);
    }

    public com.codename1.ui.Label findLabel5() {
        com.codename1.ui.Label cmp = (com.codename1.ui.Label)findByName("Label5", Display.getInstance().getCurrent());
        if(cmp == null && aboutToShowThisContainer != null) {
            cmp = (com.codename1.ui.Label)findByName("Label5", aboutToShowThisContainer);
        }
        return cmp;
    }

    public com.codename1.ui.TextField findTxtApprovedNo(Component root) {
        return (com.codename1.ui.TextField)findByName("TxtApprovedNo", root);
    }

    public com.codename1.ui.TextField findTxtApprovedNo() {
        com.codename1.ui.TextField cmp = (com.codename1.ui.TextField)findByName("TxtApprovedNo", Display.getInstance().getCurrent());
        if(cmp == null && aboutToShowThisContainer != null) {
            cmp = (com.codename1.ui.TextField)findByName("TxtApprovedNo", aboutToShowThisContainer);
        }
        return cmp;
    }

    public com.codename1.ui.TextField findTxtPostaladdr2(Component root) {
        return (com.codename1.ui.TextField)findByName("TxtPostaladdr2", root);
    }

    public com.codename1.ui.TextField findTxtPostaladdr2() {
        com.codename1.ui.TextField cmp = (com.codename1.ui.TextField)findByName("TxtPostaladdr2", Display.getInstance().getCurrent());
        if(cmp == null && aboutToShowThisContainer != null) {
            cmp = (com.codename1.ui.TextField)findByName("TxtPostaladdr2", aboutToShowThisContainer);
        }
        return cmp;
    }

    public com.codename1.ui.Button findBtnGetIdInfo(Component root) {
        return (com.codename1.ui.Button)findByName("BtnGetIdInfo", root);
    }

    public com.codename1.ui.Button findBtnGetIdInfo() {
        com.codename1.ui.Button cmp = (com.codename1.ui.Button)findByName("BtnGetIdInfo", Display.getInstance().getCurrent());
        if(cmp == null && aboutToShowThisContainer != null) {
            cmp = (com.codename1.ui.Button)findByName("BtnGetIdInfo", aboutToShowThisContainer);
        }
        return cmp;
    }

    public com.codename1.ui.Label findLabel4(Component root) {
        return (com.codename1.ui.Label)findByName("Label4", root);
    }

    public com.codename1.ui.Label findLabel4() {
        com.codename1.ui.Label cmp = (com.codename1.ui.Label)findByName("Label4", Display.getInstance().getCurrent());
        if(cmp == null && aboutToShowThisContainer != null) {
            cmp = (com.codename1.ui.Label)findByName("Label4", aboutToShowThisContainer);
        }
        return cmp;
    }

    public com.codename1.ui.Container findFrmNewEntReg(Component root) {
        return (com.codename1.ui.Container)findByName("frmNewEntReg", root);
    }

    public com.codename1.ui.Container findFrmNewEntReg() {
        com.codename1.ui.Container cmp = (com.codename1.ui.Container)findByName("frmNewEntReg", Display.getInstance().getCurrent());
        if(cmp == null && aboutToShowThisContainer != null) {
            cmp = (com.codename1.ui.Container)findByName("frmNewEntReg", aboutToShowThisContainer);
        }
        return cmp;
    }

    public com.codename1.ui.TextField findTxtPostaladdr1(Component root) {
        return (com.codename1.ui.TextField)findByName("TxtPostaladdr1", root);
    }

    public com.codename1.ui.TextField findTxtPostaladdr1() {
        com.codename1.ui.TextField cmp = (com.codename1.ui.TextField)findByName("TxtPostaladdr1", Display.getInstance().getCurrent());
        if(cmp == null && aboutToShowThisContainer != null) {
            cmp = (com.codename1.ui.TextField)findByName("TxtPostaladdr1", aboutToShowThisContainer);
        }
        return cmp;
    }

    public com.codename1.ui.Label findLabel7(Component root) {
        return (com.codename1.ui.Label)findByName("Label7", root);
    }

    public com.codename1.ui.Label findLabel7() {
        com.codename1.ui.Label cmp = (com.codename1.ui.Label)findByName("Label7", Display.getInstance().getCurrent());
        if(cmp == null && aboutToShowThisContainer != null) {
            cmp = (com.codename1.ui.Label)findByName("Label7", aboutToShowThisContainer);
        }
        return cmp;
    }

    public com.codename1.ui.Label findLabel6(Component root) {
        return (com.codename1.ui.Label)findByName("Label6", root);
    }

    public com.codename1.ui.Label findLabel6() {
        com.codename1.ui.Label cmp = (com.codename1.ui.Label)findByName("Label6", Display.getInstance().getCurrent());
        if(cmp == null && aboutToShowThisContainer != null) {
            cmp = (com.codename1.ui.Label)findByName("Label6", aboutToShowThisContainer);
        }
        return cmp;
    }

    public com.codename1.ui.Button findBtnLoadEntData(Component root) {
        return (com.codename1.ui.Button)findByName("BtnLoadEntData", root);
    }

    public com.codename1.ui.Button findBtnLoadEntData() {
        com.codename1.ui.Button cmp = (com.codename1.ui.Button)findByName("BtnLoadEntData", Display.getInstance().getCurrent());
        if(cmp == null && aboutToShowThisContainer != null) {
            cmp = (com.codename1.ui.Button)findByName("BtnLoadEntData", aboutToShowThisContainer);
        }
        return cmp;
    }

    public com.codename1.ui.Container findConSubmitName(Component root) {
        return (com.codename1.ui.Container)findByName("ConSubmitName", root);
    }

    public com.codename1.ui.Container findConSubmitName() {
        com.codename1.ui.Container cmp = (com.codename1.ui.Container)findByName("ConSubmitName", Display.getInstance().getCurrent());
        if(cmp == null && aboutToShowThisContainer != null) {
            cmp = (com.codename1.ui.Container)findByName("ConSubmitName", aboutToShowThisContainer);
        }
        return cmp;
    }

    public com.codename1.ui.TextField findPhysAddr2(Component root) {
        return (com.codename1.ui.TextField)findByName("PhysAddr2", root);
    }

    public com.codename1.ui.TextField findPhysAddr2() {
        com.codename1.ui.TextField cmp = (com.codename1.ui.TextField)findByName("PhysAddr2", Display.getInstance().getCurrent());
        if(cmp == null && aboutToShowThisContainer != null) {
            cmp = (com.codename1.ui.TextField)findByName("PhysAddr2", aboutToShowThisContainer);
        }
        return cmp;
    }

    public com.codename1.ui.TextField findPhysAddr1(Component root) {
        return (com.codename1.ui.TextField)findByName("PhysAddr1", root);
    }

    public com.codename1.ui.TextField findPhysAddr1() {
        com.codename1.ui.TextField cmp = (com.codename1.ui.TextField)findByName("PhysAddr1", Display.getInstance().getCurrent());
        if(cmp == null && aboutToShowThisContainer != null) {
            cmp = (com.codename1.ui.TextField)findByName("PhysAddr1", aboutToShowThisContainer);
        }
        return cmp;
    }

    public com.codename1.ui.Button findBtnTestNames(Component root) {
        return (com.codename1.ui.Button)findByName("BtnTestNames", root);
    }

    public com.codename1.ui.Button findBtnTestNames() {
        com.codename1.ui.Button cmp = (com.codename1.ui.Button)findByName("BtnTestNames", Display.getInstance().getCurrent());
        if(cmp == null && aboutToShowThisContainer != null) {
            cmp = (com.codename1.ui.Button)findByName("BtnTestNames", aboutToShowThisContainer);
        }
        return cmp;
    }

    public com.codename1.ui.ComboBox findCmbdirectortype(Component root) {
        return (com.codename1.ui.ComboBox)findByName("Cmbdirectortype", root);
    }

    public com.codename1.ui.ComboBox findCmbdirectortype() {
        com.codename1.ui.ComboBox cmp = (com.codename1.ui.ComboBox)findByName("Cmbdirectortype", Display.getInstance().getCurrent());
        if(cmp == null && aboutToShowThisContainer != null) {
            cmp = (com.codename1.ui.ComboBox)findByName("Cmbdirectortype", aboutToShowThisContainer);
        }
        return cmp;
    }

    public com.codename1.ui.ComboBox findCmbFyeMonth(Component root) {
        return (com.codename1.ui.ComboBox)findByName("CmbFyeMonth", root);
    }

    public com.codename1.ui.ComboBox findCmbFyeMonth() {
        com.codename1.ui.ComboBox cmp = (com.codename1.ui.ComboBox)findByName("CmbFyeMonth", Display.getInstance().getCurrent());
        if(cmp == null && aboutToShowThisContainer != null) {
            cmp = (com.codename1.ui.ComboBox)findByName("CmbFyeMonth", aboutToShowThisContainer);
        }
        return cmp;
    }

    public com.codename1.ui.Label findLabel1(Component root) {
        return (com.codename1.ui.Label)findByName("Label1", root);
    }

    public com.codename1.ui.Label findLabel1() {
        com.codename1.ui.Label cmp = (com.codename1.ui.Label)findByName("Label1", Display.getInstance().getCurrent());
        if(cmp == null && aboutToShowThisContainer != null) {
            cmp = (com.codename1.ui.Label)findByName("Label1", aboutToShowThisContainer);
        }
        return cmp;
    }

    public com.codename1.ui.Container findConDir(Component root) {
        return (com.codename1.ui.Container)findByName("ConDir", root);
    }

    public com.codename1.ui.Container findConDir() {
        com.codename1.ui.Container cmp = (com.codename1.ui.Container)findByName("ConDir", Display.getInstance().getCurrent());
        if(cmp == null && aboutToShowThisContainer != null) {
            cmp = (com.codename1.ui.Container)findByName("ConDir", aboutToShowThisContainer);
        }
        return cmp;
    }

    public com.codename1.ui.Label findLabel3(Component root) {
        return (com.codename1.ui.Label)findByName("Label3", root);
    }

    public com.codename1.ui.Label findLabel3() {
        com.codename1.ui.Label cmp = (com.codename1.ui.Label)findByName("Label3", Display.getInstance().getCurrent());
        if(cmp == null && aboutToShowThisContainer != null) {
            cmp = (com.codename1.ui.Label)findByName("Label3", aboutToShowThisContainer);
        }
        return cmp;
    }

    public com.codename1.ui.Label findLabel2(Component root) {
        return (com.codename1.ui.Label)findByName("Label2", root);
    }

    public com.codename1.ui.Label findLabel2() {
        com.codename1.ui.Label cmp = (com.codename1.ui.Label)findByName("Label2", Display.getInstance().getCurrent());
        if(cmp == null && aboutToShowThisContainer != null) {
            cmp = (com.codename1.ui.Label)findByName("Label2", aboutToShowThisContainer);
        }
        return cmp;
    }

    public com.codename1.ui.TextField findTxtEntEmail(Component root) {
        return (com.codename1.ui.TextField)findByName("TxtEntEmail", root);
    }

    public com.codename1.ui.TextField findTxtEntEmail() {
        com.codename1.ui.TextField cmp = (com.codename1.ui.TextField)findByName("TxtEntEmail", Display.getInstance().getCurrent());
        if(cmp == null && aboutToShowThisContainer != null) {
            cmp = (com.codename1.ui.TextField)findByName("TxtEntEmail", aboutToShowThisContainer);
        }
        return cmp;
    }

    public com.codename1.ui.Container findConInfo(Component root) {
        return (com.codename1.ui.Container)findByName("ConInfo", root);
    }

    public com.codename1.ui.Container findConInfo() {
        com.codename1.ui.Container cmp = (com.codename1.ui.Container)findByName("ConInfo", Display.getInstance().getCurrent());
        if(cmp == null && aboutToShowThisContainer != null) {
            cmp = (com.codename1.ui.Container)findByName("ConInfo", aboutToShowThisContainer);
        }
        return cmp;
    }

    public com.codename1.ui.TextField findTxtEmail(Component root) {
        return (com.codename1.ui.TextField)findByName("TxtEmail", root);
    }

    public com.codename1.ui.TextField findTxtEmail() {
        com.codename1.ui.TextField cmp = (com.codename1.ui.TextField)findByName("TxtEmail", Display.getInstance().getCurrent());
        if(cmp == null && aboutToShowThisContainer != null) {
            cmp = (com.codename1.ui.TextField)findByName("TxtEmail", aboutToShowThisContainer);
        }
        return cmp;
    }

    public com.codename1.ui.Container findConEnterprise(Component root) {
        return (com.codename1.ui.Container)findByName("ConEnterprise", root);
    }

    public com.codename1.ui.Container findConEnterprise() {
        com.codename1.ui.Container cmp = (com.codename1.ui.Container)findByName("ConEnterprise", Display.getInstance().getCurrent());
        if(cmp == null && aboutToShowThisContainer != null) {
            cmp = (com.codename1.ui.Container)findByName("ConEnterprise", aboutToShowThisContainer);
        }
        return cmp;
    }

    public com.codename1.ui.Container findConDirectors(Component root) {
        return (com.codename1.ui.Container)findByName("ConDirectors", root);
    }

    public com.codename1.ui.Container findConDirectors() {
        com.codename1.ui.Container cmp = (com.codename1.ui.Container)findByName("ConDirectors", Display.getInstance().getCurrent());
        if(cmp == null && aboutToShowThisContainer != null) {
            cmp = (com.codename1.ui.Container)findByName("ConDirectors", aboutToShowThisContainer);
        }
        return cmp;
    }

    public com.codename1.ui.Label findLblName4Response(Component root) {
        return (com.codename1.ui.Label)findByName("lblName4Response", root);
    }

    public com.codename1.ui.Label findLblName4Response() {
        com.codename1.ui.Label cmp = (com.codename1.ui.Label)findByName("lblName4Response", Display.getInstance().getCurrent());
        if(cmp == null && aboutToShowThisContainer != null) {
            cmp = (com.codename1.ui.Label)findByName("lblName4Response", aboutToShowThisContainer);
        }
        return cmp;
    }

    public com.codename1.ui.TextField findTxtrelativeID(Component root) {
        return (com.codename1.ui.TextField)findByName("TxtrelativeID", root);
    }

    public com.codename1.ui.TextField findTxtrelativeID() {
        com.codename1.ui.TextField cmp = (com.codename1.ui.TextField)findByName("TxtrelativeID", Display.getInstance().getCurrent());
        if(cmp == null && aboutToShowThisContainer != null) {
            cmp = (com.codename1.ui.TextField)findByName("TxtrelativeID", aboutToShowThisContainer);
        }
        return cmp;
    }

    public com.codename1.ui.Container findConNames(Component root) {
        return (com.codename1.ui.Container)findByName("ConNames", root);
    }

    public com.codename1.ui.Container findConNames() {
        com.codename1.ui.Container cmp = (com.codename1.ui.Container)findByName("ConNames", Display.getInstance().getCurrent());
        if(cmp == null && aboutToShowThisContainer != null) {
            cmp = (com.codename1.ui.Container)findByName("ConNames", aboutToShowThisContainer);
        }
        return cmp;
    }

    public com.codename1.ui.TextField findTxtPhysAddr2(Component root) {
        return (com.codename1.ui.TextField)findByName("txtPhysAddr2", root);
    }

    public com.codename1.ui.TextField findTxtPhysAddr2() {
        com.codename1.ui.TextField cmp = (com.codename1.ui.TextField)findByName("txtPhysAddr2", Display.getInstance().getCurrent());
        if(cmp == null && aboutToShowThisContainer != null) {
            cmp = (com.codename1.ui.TextField)findByName("txtPhysAddr2", aboutToShowThisContainer);
        }
        return cmp;
    }

    public com.codename1.ui.TextField findTxtPhysAddr1(Component root) {
        return (com.codename1.ui.TextField)findByName("txtPhysAddr1", root);
    }

    public com.codename1.ui.TextField findTxtPhysAddr1() {
        com.codename1.ui.TextField cmp = (com.codename1.ui.TextField)findByName("txtPhysAddr1", Display.getInstance().getCurrent());
        if(cmp == null && aboutToShowThisContainer != null) {
            cmp = (com.codename1.ui.TextField)findByName("txtPhysAddr1", aboutToShowThisContainer);
        }
        return cmp;
    }

    public com.codename1.ui.ComboBox findCmbPhysProvince(Component root) {
        return (com.codename1.ui.ComboBox)findByName("CmbPhysProvince", root);
    }

    public com.codename1.ui.ComboBox findCmbPhysProvince() {
        com.codename1.ui.ComboBox cmp = (com.codename1.ui.ComboBox)findByName("CmbPhysProvince", Display.getInstance().getCurrent());
        if(cmp == null && aboutToShowThisContainer != null) {
            cmp = (com.codename1.ui.ComboBox)findByName("CmbPhysProvince", aboutToShowThisContainer);
        }
        return cmp;
    }

    public com.codename1.ui.TextField findTxtIdNo(Component root) {
        return (com.codename1.ui.TextField)findByName("TxtIdNo", root);
    }

    public com.codename1.ui.TextField findTxtIdNo() {
        com.codename1.ui.TextField cmp = (com.codename1.ui.TextField)findByName("TxtIdNo", Display.getInstance().getCurrent());
        if(cmp == null && aboutToShowThisContainer != null) {
            cmp = (com.codename1.ui.TextField)findByName("TxtIdNo", aboutToShowThisContainer);
        }
        return cmp;
    }

    public com.codename1.ui.Container findCon4Names(Component root) {
        return (com.codename1.ui.Container)findByName("Con4Names", root);
    }

    public com.codename1.ui.Container findCon4Names() {
        com.codename1.ui.Container cmp = (com.codename1.ui.Container)findByName("Con4Names", Display.getInstance().getCurrent());
        if(cmp == null && aboutToShowThisContainer != null) {
            cmp = (com.codename1.ui.Container)findByName("Con4Names", aboutToShowThisContainer);
        }
        return cmp;
    }

    public com.codename1.ui.spinner.Picker findDtDatofBirth(Component root) {
        return (com.codename1.ui.spinner.Picker)findByName("DtDatofBirth", root);
    }

    public com.codename1.ui.spinner.Picker findDtDatofBirth() {
        com.codename1.ui.spinner.Picker cmp = (com.codename1.ui.spinner.Picker)findByName("DtDatofBirth", Display.getInstance().getCurrent());
        if(cmp == null && aboutToShowThisContainer != null) {
            cmp = (com.codename1.ui.spinner.Picker)findByName("DtDatofBirth", aboutToShowThisContainer);
        }
        return cmp;
    }

    public com.codename1.ui.TextField findPhysAddr3(Component root) {
        return (com.codename1.ui.TextField)findByName("PhysAddr3", root);
    }

    public com.codename1.ui.TextField findPhysAddr3() {
        com.codename1.ui.TextField cmp = (com.codename1.ui.TextField)findByName("PhysAddr3", Display.getInstance().getCurrent());
        if(cmp == null && aboutToShowThisContainer != null) {
            cmp = (com.codename1.ui.TextField)findByName("PhysAddr3", aboutToShowThisContainer);
        }
        return cmp;
    }

    public static final int COMMAND_MainNewRegistration = 1;

    protected boolean onMainNewRegistration() {
        return false;
    }

    protected void processCommand(ActionEvent ev, Command cmd) {
        switch(cmd.getId()) {
            case COMMAND_MainNewRegistration:
                if(onMainNewRegistration()) {
                    ev.consume();
                    return;
                }
                break;

        }
        if(ev.getComponent() != null) {
            handleComponentAction(ev.getComponent(), ev);
        }
    }

    protected void exitForm(Form f) {
        if("frmNewEntReg".equals(f.getName())) {
            exitFrmNewEntReg(f);
            aboutToShowThisContainer = null;
            return;
        }

        if("frmNewEntReg1".equals(f.getName())) {
            exitFrmNewEntReg1(f);
            aboutToShowThisContainer = null;
            return;
        }

        if("Main".equals(f.getName())) {
            exitMain(f);
            aboutToShowThisContainer = null;
            return;
        }

            return;
    }


    protected void exitFrmNewEntReg(Form f) {
    }


    protected void exitFrmNewEntReg1(Form f) {
    }


    protected void exitMain(Form f) {
    }

    protected void beforeShow(Form f) {
    aboutToShowThisContainer = f;
        if("frmNewEntReg".equals(f.getName())) {
            beforeFrmNewEntReg(f);
            aboutToShowThisContainer = null;
            return;
        }

        if("frmNewEntReg1".equals(f.getName())) {
            beforeFrmNewEntReg1(f);
            aboutToShowThisContainer = null;
            return;
        }

        if("Main".equals(f.getName())) {
            beforeMain(f);
            aboutToShowThisContainer = null;
            return;
        }

            return;
    }


    protected void beforeFrmNewEntReg(Form f) {
    }


    protected void beforeFrmNewEntReg1(Form f) {
    }


    protected void beforeMain(Form f) {
    }

    protected void beforeShowContainer(Container c) {
        aboutToShowThisContainer = c;
        if("frmNewEntReg".equals(c.getName())) {
            beforeContainerFrmNewEntReg(c);
            aboutToShowThisContainer = null;
            return;
        }

        if("frmNewEntReg1".equals(c.getName())) {
            beforeContainerFrmNewEntReg1(c);
            aboutToShowThisContainer = null;
            return;
        }

        if("Main".equals(c.getName())) {
            beforeContainerMain(c);
            aboutToShowThisContainer = null;
            return;
        }

            return;
    }


    protected void beforeContainerFrmNewEntReg(Container c) {
    }


    protected void beforeContainerFrmNewEntReg1(Container c) {
    }


    protected void beforeContainerMain(Container c) {
    }

    protected void postShow(Form f) {
        if("frmNewEntReg".equals(f.getName())) {
            postFrmNewEntReg(f);
            aboutToShowThisContainer = null;
            return;
        }

        if("frmNewEntReg1".equals(f.getName())) {
            postFrmNewEntReg1(f);
            aboutToShowThisContainer = null;
            return;
        }

        if("Main".equals(f.getName())) {
            postMain(f);
            aboutToShowThisContainer = null;
            return;
        }

            return;
    }


    protected void postFrmNewEntReg(Form f) {
    }


    protected void postFrmNewEntReg1(Form f) {
    }


    protected void postMain(Form f) {
    }

    protected void postShowContainer(Container c) {
        if("frmNewEntReg".equals(c.getName())) {
            postContainerFrmNewEntReg(c);
            aboutToShowThisContainer = null;
            return;
        }

        if("frmNewEntReg1".equals(c.getName())) {
            postContainerFrmNewEntReg1(c);
            aboutToShowThisContainer = null;
            return;
        }

        if("Main".equals(c.getName())) {
            postContainerMain(c);
            aboutToShowThisContainer = null;
            return;
        }

            return;
    }


    protected void postContainerFrmNewEntReg(Container c) {
    }


    protected void postContainerFrmNewEntReg1(Container c) {
    }


    protected void postContainerMain(Container c) {
    }

    protected void onCreateRoot(String rootName) {
        if("frmNewEntReg".equals(rootName)) {
            onCreateFrmNewEntReg();
            aboutToShowThisContainer = null;
            return;
        }

        if("frmNewEntReg1".equals(rootName)) {
            onCreateFrmNewEntReg1();
            aboutToShowThisContainer = null;
            return;
        }

        if("Main".equals(rootName)) {
            onCreateMain();
            aboutToShowThisContainer = null;
            return;
        }

            return;
    }


    protected void onCreateFrmNewEntReg() {
    }


    protected void onCreateFrmNewEntReg1() {
    }


    protected void onCreateMain() {
    }

    protected Hashtable getFormState(Form f) {
        Hashtable h = super.getFormState(f);
        if("frmNewEntReg".equals(f.getName())) {
            getStateFrmNewEntReg(f, h);
            aboutToShowThisContainer = null;
            return h;
        }

        if("frmNewEntReg1".equals(f.getName())) {
            getStateFrmNewEntReg1(f, h);
            aboutToShowThisContainer = null;
            return h;
        }

        if("Main".equals(f.getName())) {
            getStateMain(f, h);
            aboutToShowThisContainer = null;
            return h;
        }

            return h;
    }


    protected void getStateFrmNewEntReg(Form f, Hashtable h) {
    }


    protected void getStateFrmNewEntReg1(Form f, Hashtable h) {
    }


    protected void getStateMain(Form f, Hashtable h) {
    }

    protected void setFormState(Form f, Hashtable state) {
        super.setFormState(f, state);
        if("frmNewEntReg".equals(f.getName())) {
            setStateFrmNewEntReg(f, state);
            aboutToShowThisContainer = null;
            return;
        }

        if("frmNewEntReg1".equals(f.getName())) {
            setStateFrmNewEntReg1(f, state);
            aboutToShowThisContainer = null;
            return;
        }

        if("Main".equals(f.getName())) {
            setStateMain(f, state);
            aboutToShowThisContainer = null;
            return;
        }

            return;
    }


    protected void setStateFrmNewEntReg(Form f, Hashtable state) {
    }


    protected void setStateFrmNewEntReg1(Form f, Hashtable state) {
    }


    protected void setStateMain(Form f, Hashtable state) {
    }

    protected boolean setListModel(List cmp) {
        String listName = cmp.getName();
        if("CmbentPostalPr".equals(listName)) {
            return initListModelCmbentPostalPr(cmp);
        }
        if("CmbPostalProvince".equals(listName)) {
            return initListModelCmbPostalProvince(cmp);
        }
        if("CmbProvince".equals(listName)) {
            return initListModelCmbProvince(cmp);
        }
        if("Cmbdirectortype".equals(listName)) {
            return initListModelCmbdirectortype(cmp);
        }
        if("CmbFyeMonth".equals(listName)) {
            return initListModelCmbFyeMonth(cmp);
        }
        if("CmbPhysProvince".equals(listName)) {
            return initListModelCmbPhysProvince(cmp);
        }
        return super.setListModel(cmp);
    }

    protected boolean initListModelCmbentPostalPr(List cmp) {
        return false;
    }

    protected boolean initListModelCmbPostalProvince(List cmp) {
        return false;
    }

    protected boolean initListModelCmbProvince(List cmp) {
        return false;
    }

    protected boolean initListModelCmbdirectortype(List cmp) {
        return false;
    }

    protected boolean initListModelCmbFyeMonth(List cmp) {
        return false;
    }

    protected boolean initListModelCmbPhysProvince(List cmp) {
        return false;
    }

    protected void handleComponentAction(Component c, ActionEvent event) {
        Container rootContainerAncestor = getRootAncestor(c);
        if(rootContainerAncestor == null) return;
        String rootContainerName = rootContainerAncestor.getName();
        Container leadParentContainer = c.getParent().getLeadParent();
        if(leadParentContainer != null && leadParentContainer.getClass() != Container.class) {
            c = c.getParent().getLeadParent();
        }
        if(rootContainerName == null) return;
        if(rootContainerName.equals("frmNewEntReg")) {
            if("ChBSubmitNameReservation".equals(c.getName())) {
                onFrmNewEntReg_ChBSubmitNameReservationAction(c, event);
                return;
            }
            if("CheckBox".equals(c.getName())) {
                onFrmNewEntReg_CheckBoxAction(c, event);
                return;
            }
            if("TxtApprovedNo".equals(c.getName())) {
                onFrmNewEntReg_TxtApprovedNoAction(c, event);
                return;
            }
            if("BtnStartNewReg".equals(c.getName())) {
                onFrmNewEntReg_BtnStartNewRegAction(c, event);
                return;
            }
            if("Txtname1".equals(c.getName())) {
                onFrmNewEntReg_Txtname1Action(c, event);
                return;
            }
            if("Txtname2".equals(c.getName())) {
                onFrmNewEntReg_Txtname2Action(c, event);
                return;
            }
            if("Txtname3".equals(c.getName())) {
                onFrmNewEntReg_Txtname3Action(c, event);
                return;
            }
            if("Txtname4".equals(c.getName())) {
                onFrmNewEntReg_Txtname4Action(c, event);
                return;
            }
            if("BtnTestNames".equals(c.getName())) {
                onFrmNewEntReg_BtnTestNamesAction(c, event);
                return;
            }
            if("BtnFileName".equals(c.getName())) {
                onFrmNewEntReg_BtnFileNameAction(c, event);
                return;
            }
            if("CmbFyeMonth".equals(c.getName())) {
                onFrmNewEntReg_CmbFyeMonthAction(c, event);
                return;
            }
            if("TxtAuthShares".equals(c.getName())) {
                onFrmNewEntReg_TxtAuthSharesAction(c, event);
                return;
            }
            if("TxtEmail".equals(c.getName())) {
                onFrmNewEntReg_TxtEmailAction(c, event);
                return;
            }
            if("txtPhysAddr1".equals(c.getName())) {
                onFrmNewEntReg_TxtPhysAddr1Action(c, event);
                return;
            }
            if("txtPhysAddr2".equals(c.getName())) {
                onFrmNewEntReg_TxtPhysAddr2Action(c, event);
                return;
            }
            if("txtPhysAddr3".equals(c.getName())) {
                onFrmNewEntReg_TxtPhysAddr3Action(c, event);
                return;
            }
            if("CmbPhysProvince".equals(c.getName())) {
                onFrmNewEntReg_CmbPhysProvinceAction(c, event);
                return;
            }
            if("txtPhysCode".equals(c.getName())) {
                onFrmNewEntReg_TxtPhysCodeAction(c, event);
                return;
            }
            if("ChbIssameasPhys".equals(c.getName())) {
                onFrmNewEntReg_ChbIssameasPhysAction(c, event);
                return;
            }
            if("TxtPostaladdr1".equals(c.getName())) {
                onFrmNewEntReg_TxtPostaladdr1Action(c, event);
                return;
            }
            if("TxtPostaladdr2".equals(c.getName())) {
                onFrmNewEntReg_TxtPostaladdr2Action(c, event);
                return;
            }
            if("TxtPostaladdr3".equals(c.getName())) {
                onFrmNewEntReg_TxtPostaladdr3Action(c, event);
                return;
            }
            if("CmbPostalProvince".equals(c.getName())) {
                onFrmNewEntReg_CmbPostalProvinceAction(c, event);
                return;
            }
            if("TxtPostalcode".equals(c.getName())) {
                onFrmNewEntReg_TxtPostalcodeAction(c, event);
                return;
            }
            if("TxtIdNo".equals(c.getName())) {
                onFrmNewEntReg_TxtIdNoAction(c, event);
                return;
            }
            if("TxtrelativeID".equals(c.getName())) {
                onFrmNewEntReg_TxtrelativeIDAction(c, event);
                return;
            }
            if("BtnGetIdInfo".equals(c.getName())) {
                onFrmNewEntReg_BtnGetIdInfoAction(c, event);
                return;
            }
            if("Cmbdirectortype".equals(c.getName())) {
                onFrmNewEntReg_CmbdirectortypeAction(c, event);
                return;
            }
            if("dtAppDate".equals(c.getName())) {
                onFrmNewEntReg_DtAppDateAction(c, event);
                return;
            }
            if("DtDatofBirth".equals(c.getName())) {
                onFrmNewEntReg_DtDatofBirthAction(c, event);
                return;
            }
            if("TxtCell".equals(c.getName())) {
                onFrmNewEntReg_TxtCellAction(c, event);
                return;
            }
            if("PhysAddr1".equals(c.getName())) {
                onFrmNewEntReg_PhysAddr1Action(c, event);
                return;
            }
            if("PhysAddr2".equals(c.getName())) {
                onFrmNewEntReg_PhysAddr2Action(c, event);
                return;
            }
            if("PhysAddr3".equals(c.getName())) {
                onFrmNewEntReg_PhysAddr3Action(c, event);
                return;
            }
            if("CmbProvince".equals(c.getName())) {
                onFrmNewEntReg_CmbProvinceAction(c, event);
                return;
            }
            if("Physaddrcode".equals(c.getName())) {
                onFrmNewEntReg_PhysaddrcodeAction(c, event);
                return;
            }
            if("ChbBaddresssame".equals(c.getName())) {
                onFrmNewEntReg_ChbBaddresssameAction(c, event);
                return;
            }
            if("TxtPostalAddr1".equals(c.getName())) {
                onFrmNewEntReg_TxtPostalAddr1Action(c, event);
                return;
            }
            if("TxtPostalAddr2".equals(c.getName())) {
                onFrmNewEntReg_TxtPostalAddr2Action(c, event);
                return;
            }
            if("TxtPostalAddr3".equals(c.getName())) {
                onFrmNewEntReg_TxtPostalAddr3Action(c, event);
                return;
            }
            if("TxtPostalCode".equals(c.getName())) {
                onFrmNewEntReg_TxtPostalCodeAction(c, event);
                return;
            }
            if("BtnAddDirector".equals(c.getName())) {
                onFrmNewEntReg_BtnAddDirectorAction(c, event);
                return;
            }
        }
        if(rootContainerName.equals("frmNewEntReg1")) {
            if("ChBSubmitNameReservation".equals(c.getName())) {
                onFrmNewEntReg1_ChBSubmitNameReservationAction(c, event);
                return;
            }
            if("ChkBApprovedName".equals(c.getName())) {
                onFrmNewEntReg1_ChkBApprovedNameAction(c, event);
                return;
            }
            if("TxtApprovedNo".equals(c.getName())) {
                onFrmNewEntReg1_TxtApprovedNoAction(c, event);
                return;
            }
            if("btnvalno".equals(c.getName())) {
                onFrmNewEntReg1_BtnvalnoAction(c, event);
                return;
            }
            if("BtnStartNewReg".equals(c.getName())) {
                onFrmNewEntReg1_BtnStartNewRegAction(c, event);
                return;
            }
            if("Txtname1".equals(c.getName())) {
                onFrmNewEntReg1_Txtname1Action(c, event);
                return;
            }
            if("Txtname2".equals(c.getName())) {
                onFrmNewEntReg1_Txtname2Action(c, event);
                return;
            }
            if("Txtname3".equals(c.getName())) {
                onFrmNewEntReg1_Txtname3Action(c, event);
                return;
            }
            if("Txtname4".equals(c.getName())) {
                onFrmNewEntReg1_Txtname4Action(c, event);
                return;
            }
            if("BtnTestNames".equals(c.getName())) {
                onFrmNewEntReg1_BtnTestNamesAction(c, event);
                return;
            }
            if("BtnFileName".equals(c.getName())) {
                onFrmNewEntReg1_BtnFileNameAction(c, event);
                return;
            }
            if("CmbFyeMonth".equals(c.getName())) {
                onFrmNewEntReg1_CmbFyeMonthAction(c, event);
                return;
            }
            if("TxtAuthShares".equals(c.getName())) {
                onFrmNewEntReg1_TxtAuthSharesAction(c, event);
                return;
            }
            if("TxtEntEmail".equals(c.getName())) {
                onFrmNewEntReg1_TxtEntEmailAction(c, event);
                return;
            }
            if("txtPhysAddr1".equals(c.getName())) {
                onFrmNewEntReg1_TxtPhysAddr1Action(c, event);
                return;
            }
            if("txtPhysAddr2".equals(c.getName())) {
                onFrmNewEntReg1_TxtPhysAddr2Action(c, event);
                return;
            }
            if("txtPhysAddr3".equals(c.getName())) {
                onFrmNewEntReg1_TxtPhysAddr3Action(c, event);
                return;
            }
            if("CmbPhysProvince".equals(c.getName())) {
                onFrmNewEntReg1_CmbPhysProvinceAction(c, event);
                return;
            }
            if("txtPhysCode".equals(c.getName())) {
                onFrmNewEntReg1_TxtPhysCodeAction(c, event);
                return;
            }
            if("ChbIssameasPhys".equals(c.getName())) {
                onFrmNewEntReg1_ChbIssameasPhysAction(c, event);
                return;
            }
            if("TxtPostaladdr1".equals(c.getName())) {
                onFrmNewEntReg1_TxtPostaladdr1Action(c, event);
                return;
            }
            if("TxtPostaladdr2".equals(c.getName())) {
                onFrmNewEntReg1_TxtPostaladdr2Action(c, event);
                return;
            }
            if("TxtPostaladdr3".equals(c.getName())) {
                onFrmNewEntReg1_TxtPostaladdr3Action(c, event);
                return;
            }
            if("CmbentPostalPr".equals(c.getName())) {
                onFrmNewEntReg1_CmbentPostalPrAction(c, event);
                return;
            }
            if("TxtPostalcode".equals(c.getName())) {
                onFrmNewEntReg1_TxtPostalcodeAction(c, event);
                return;
            }
            if("BtnLoadEntData".equals(c.getName())) {
                onFrmNewEntReg1_BtnLoadEntDataAction(c, event);
                return;
            }
            if("TxtIdNo".equals(c.getName())) {
                onFrmNewEntReg1_TxtIdNoAction(c, event);
                return;
            }
            if("TxtrelativeID".equals(c.getName())) {
                onFrmNewEntReg1_TxtrelativeIDAction(c, event);
                return;
            }
            if("BtnGetIdInfo".equals(c.getName())) {
                onFrmNewEntReg1_BtnGetIdInfoAction(c, event);
                return;
            }
            if("Cmbdirectortype".equals(c.getName())) {
                onFrmNewEntReg1_CmbdirectortypeAction(c, event);
                return;
            }
            if("dtAppDate".equals(c.getName())) {
                onFrmNewEntReg1_DtAppDateAction(c, event);
                return;
            }
            if("DtDatofBirth".equals(c.getName())) {
                onFrmNewEntReg1_DtDatofBirthAction(c, event);
                return;
            }
            if("TxtCell".equals(c.getName())) {
                onFrmNewEntReg1_TxtCellAction(c, event);
                return;
            }
            if("TxtEmail".equals(c.getName())) {
                onFrmNewEntReg1_TxtEmailAction(c, event);
                return;
            }
            if("PhysAddr1".equals(c.getName())) {
                onFrmNewEntReg1_PhysAddr1Action(c, event);
                return;
            }
            if("PhysAddr2".equals(c.getName())) {
                onFrmNewEntReg1_PhysAddr2Action(c, event);
                return;
            }
            if("PhysAddr3".equals(c.getName())) {
                onFrmNewEntReg1_PhysAddr3Action(c, event);
                return;
            }
            if("CmbProvince".equals(c.getName())) {
                onFrmNewEntReg1_CmbProvinceAction(c, event);
                return;
            }
            if("Physaddrcode".equals(c.getName())) {
                onFrmNewEntReg1_PhysaddrcodeAction(c, event);
                return;
            }
            if("ChbBaddresssame".equals(c.getName())) {
                onFrmNewEntReg1_ChbBaddresssameAction(c, event);
                return;
            }
            if("TxtPostalAddr1".equals(c.getName())) {
                onFrmNewEntReg1_TxtPostalAddr1Action(c, event);
                return;
            }
            if("TxtPostalAddr2".equals(c.getName())) {
                onFrmNewEntReg1_TxtPostalAddr2Action(c, event);
                return;
            }
            if("TxtPostalAddr3".equals(c.getName())) {
                onFrmNewEntReg1_TxtPostalAddr3Action(c, event);
                return;
            }
            if("CmbPostalProvince".equals(c.getName())) {
                onFrmNewEntReg1_CmbPostalProvinceAction(c, event);
                return;
            }
            if("TxtPostalCode".equals(c.getName())) {
                onFrmNewEntReg1_TxtPostalCodeAction(c, event);
                return;
            }
            if("BtnAddDirector".equals(c.getName())) {
                onFrmNewEntReg1_BtnAddDirectorAction(c, event);
                return;
            }
        }
        if(rootContainerName.equals("Main")) {
            if("Button".equals(c.getName())) {
                onMain_ButtonAction(c, event);
                return;
            }
        }
    }

      protected void onFrmNewEntReg_ChBSubmitNameReservationAction(Component c, ActionEvent event) {
      }

      protected void onFrmNewEntReg_CheckBoxAction(Component c, ActionEvent event) {
      }

      protected void onFrmNewEntReg_TxtApprovedNoAction(Component c, ActionEvent event) {
      }

      protected void onFrmNewEntReg_BtnStartNewRegAction(Component c, ActionEvent event) {
      }

      protected void onFrmNewEntReg_Txtname1Action(Component c, ActionEvent event) {
      }

      protected void onFrmNewEntReg_Txtname2Action(Component c, ActionEvent event) {
      }

      protected void onFrmNewEntReg_Txtname3Action(Component c, ActionEvent event) {
      }

      protected void onFrmNewEntReg_Txtname4Action(Component c, ActionEvent event) {
      }

      protected void onFrmNewEntReg_BtnTestNamesAction(Component c, ActionEvent event) {
      }

      protected void onFrmNewEntReg_BtnFileNameAction(Component c, ActionEvent event) {
      }

      protected void onFrmNewEntReg_CmbFyeMonthAction(Component c, ActionEvent event) {
      }

      protected void onFrmNewEntReg_TxtAuthSharesAction(Component c, ActionEvent event) {
      }

      protected void onFrmNewEntReg_TxtEmailAction(Component c, ActionEvent event) {
      }

      protected void onFrmNewEntReg_TxtPhysAddr1Action(Component c, ActionEvent event) {
      }

      protected void onFrmNewEntReg_TxtPhysAddr2Action(Component c, ActionEvent event) {
      }

      protected void onFrmNewEntReg_TxtPhysAddr3Action(Component c, ActionEvent event) {
      }

      protected void onFrmNewEntReg_CmbPhysProvinceAction(Component c, ActionEvent event) {
      }

      protected void onFrmNewEntReg_TxtPhysCodeAction(Component c, ActionEvent event) {
      }

      protected void onFrmNewEntReg_ChbIssameasPhysAction(Component c, ActionEvent event) {
      }

      protected void onFrmNewEntReg_TxtPostaladdr1Action(Component c, ActionEvent event) {
      }

      protected void onFrmNewEntReg_TxtPostaladdr2Action(Component c, ActionEvent event) {
      }

      protected void onFrmNewEntReg_TxtPostaladdr3Action(Component c, ActionEvent event) {
      }

      protected void onFrmNewEntReg_CmbPostalProvinceAction(Component c, ActionEvent event) {
      }

      protected void onFrmNewEntReg_TxtPostalcodeAction(Component c, ActionEvent event) {
      }

      protected void onFrmNewEntReg_TxtIdNoAction(Component c, ActionEvent event) {
      }

      protected void onFrmNewEntReg_TxtrelativeIDAction(Component c, ActionEvent event) {
      }

      protected void onFrmNewEntReg_BtnGetIdInfoAction(Component c, ActionEvent event) {
      }

      protected void onFrmNewEntReg_CmbdirectortypeAction(Component c, ActionEvent event) {
      }

      protected void onFrmNewEntReg_DtAppDateAction(Component c, ActionEvent event) {
      }

      protected void onFrmNewEntReg_DtDatofBirthAction(Component c, ActionEvent event) {
      }

      protected void onFrmNewEntReg_TxtCellAction(Component c, ActionEvent event) {
      }

      protected void onFrmNewEntReg_PhysAddr1Action(Component c, ActionEvent event) {
      }

      protected void onFrmNewEntReg_PhysAddr2Action(Component c, ActionEvent event) {
      }

      protected void onFrmNewEntReg_PhysAddr3Action(Component c, ActionEvent event) {
      }

      protected void onFrmNewEntReg_CmbProvinceAction(Component c, ActionEvent event) {
      }

      protected void onFrmNewEntReg_PhysaddrcodeAction(Component c, ActionEvent event) {
      }

      protected void onFrmNewEntReg_ChbBaddresssameAction(Component c, ActionEvent event) {
      }

      protected void onFrmNewEntReg_TxtPostalAddr1Action(Component c, ActionEvent event) {
      }

      protected void onFrmNewEntReg_TxtPostalAddr2Action(Component c, ActionEvent event) {
      }

      protected void onFrmNewEntReg_TxtPostalAddr3Action(Component c, ActionEvent event) {
      }

      protected void onFrmNewEntReg_TxtPostalCodeAction(Component c, ActionEvent event) {
      }

      protected void onFrmNewEntReg_BtnAddDirectorAction(Component c, ActionEvent event) {
      }

      protected void onFrmNewEntReg1_ChBSubmitNameReservationAction(Component c, ActionEvent event) {
      }

      protected void onFrmNewEntReg1_ChkBApprovedNameAction(Component c, ActionEvent event) {
      }

      protected void onFrmNewEntReg1_TxtApprovedNoAction(Component c, ActionEvent event) {
      }

      protected void onFrmNewEntReg1_BtnvalnoAction(Component c, ActionEvent event) {
      }

      protected void onFrmNewEntReg1_BtnStartNewRegAction(Component c, ActionEvent event) {
      }

      protected void onFrmNewEntReg1_Txtname1Action(Component c, ActionEvent event) {
      }

      protected void onFrmNewEntReg1_Txtname2Action(Component c, ActionEvent event) {
      }

      protected void onFrmNewEntReg1_Txtname3Action(Component c, ActionEvent event) {
      }

      protected void onFrmNewEntReg1_Txtname4Action(Component c, ActionEvent event) {
      }

      protected void onFrmNewEntReg1_BtnTestNamesAction(Component c, ActionEvent event) {
      }

      protected void onFrmNewEntReg1_BtnFileNameAction(Component c, ActionEvent event) {
      }

      protected void onFrmNewEntReg1_CmbFyeMonthAction(Component c, ActionEvent event) {
      }

      protected void onFrmNewEntReg1_TxtAuthSharesAction(Component c, ActionEvent event) {
      }

      protected void onFrmNewEntReg1_TxtEntEmailAction(Component c, ActionEvent event) {
      }

      protected void onFrmNewEntReg1_TxtPhysAddr1Action(Component c, ActionEvent event) {
      }

      protected void onFrmNewEntReg1_TxtPhysAddr2Action(Component c, ActionEvent event) {
      }

      protected void onFrmNewEntReg1_TxtPhysAddr3Action(Component c, ActionEvent event) {
      }

      protected void onFrmNewEntReg1_CmbPhysProvinceAction(Component c, ActionEvent event) {
      }

      protected void onFrmNewEntReg1_TxtPhysCodeAction(Component c, ActionEvent event) {
      }

      protected void onFrmNewEntReg1_ChbIssameasPhysAction(Component c, ActionEvent event) {
      }

      protected void onFrmNewEntReg1_TxtPostaladdr1Action(Component c, ActionEvent event) {
      }

      protected void onFrmNewEntReg1_TxtPostaladdr2Action(Component c, ActionEvent event) {
      }

      protected void onFrmNewEntReg1_TxtPostaladdr3Action(Component c, ActionEvent event) {
      }

      protected void onFrmNewEntReg1_CmbentPostalPrAction(Component c, ActionEvent event) {
      }

      protected void onFrmNewEntReg1_TxtPostalcodeAction(Component c, ActionEvent event) {
      }

      protected void onFrmNewEntReg1_BtnLoadEntDataAction(Component c, ActionEvent event) {
      }

      protected void onFrmNewEntReg1_TxtIdNoAction(Component c, ActionEvent event) {
      }

      protected void onFrmNewEntReg1_TxtrelativeIDAction(Component c, ActionEvent event) {
      }

      protected void onFrmNewEntReg1_BtnGetIdInfoAction(Component c, ActionEvent event) {
      }

      protected void onFrmNewEntReg1_CmbdirectortypeAction(Component c, ActionEvent event) {
      }

      protected void onFrmNewEntReg1_DtAppDateAction(Component c, ActionEvent event) {
      }

      protected void onFrmNewEntReg1_DtDatofBirthAction(Component c, ActionEvent event) {
      }

      protected void onFrmNewEntReg1_TxtCellAction(Component c, ActionEvent event) {
      }

      protected void onFrmNewEntReg1_TxtEmailAction(Component c, ActionEvent event) {
      }

      protected void onFrmNewEntReg1_PhysAddr1Action(Component c, ActionEvent event) {
      }

      protected void onFrmNewEntReg1_PhysAddr2Action(Component c, ActionEvent event) {
      }

      protected void onFrmNewEntReg1_PhysAddr3Action(Component c, ActionEvent event) {
      }

      protected void onFrmNewEntReg1_CmbProvinceAction(Component c, ActionEvent event) {
      }

      protected void onFrmNewEntReg1_PhysaddrcodeAction(Component c, ActionEvent event) {
      }

      protected void onFrmNewEntReg1_ChbBaddresssameAction(Component c, ActionEvent event) {
      }

      protected void onFrmNewEntReg1_TxtPostalAddr1Action(Component c, ActionEvent event) {
      }

      protected void onFrmNewEntReg1_TxtPostalAddr2Action(Component c, ActionEvent event) {
      }

      protected void onFrmNewEntReg1_TxtPostalAddr3Action(Component c, ActionEvent event) {
      }

      protected void onFrmNewEntReg1_CmbPostalProvinceAction(Component c, ActionEvent event) {
      }

      protected void onFrmNewEntReg1_TxtPostalCodeAction(Component c, ActionEvent event) {
      }

      protected void onFrmNewEntReg1_BtnAddDirectorAction(Component c, ActionEvent event) {
      }

      protected void onMain_ButtonAction(Component c, ActionEvent event) {
      }

}
