package org.ocpsoft.rewrite.rewrite_192_reproducer;

import java.io.Serializable;

import javax.enterprise.context.RequestScoped;
import javax.inject.Named;

import org.ocpsoft.rewrite.annotation.Join;
import org.ocpsoft.rewrite.annotation.Parameter;
import org.ocpsoft.rewrite.annotation.RequestAction;
import org.ocpsoft.rewrite.faces.annotation.Deferred;
import org.ocpsoft.rewrite.faces.annotation.IgnorePostback;


@Named
@RequestScoped
@Join(path = "/alphabet", to = "/alphabet.jsf")
public class MultipleParameterAlphabetBean implements Serializable {

    private static final long serialVersionUID = 8430456868734453251L;

    private String output;

    @Parameter
    @Deferred
    @IgnorePostback
    private String a;

    @Parameter
    @Deferred
    @IgnorePostback
    private String b;

    @Parameter
    @Deferred
    @IgnorePostback
    private String c;

    @Parameter
    @Deferred
    @IgnorePostback
    private String d;

    @Parameter
    @Deferred
    @IgnorePostback
    private String e;

    @Parameter
    @Deferred
    @IgnorePostback
    private String f;

    @RequestAction
    @Deferred
    @IgnorePostback
    public void applyParameters() {
        output = "numbers";
    }

    public String getOutput() {
        return output;
    }

}
