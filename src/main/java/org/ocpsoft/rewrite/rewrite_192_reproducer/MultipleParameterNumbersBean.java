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
@Join(path = "/numbers", to = "/numbers.jsf")
public class MultipleParameterNumbersBean implements Serializable {

    private static final long serialVersionUID = -5701115567998214503L;

    private String output;

    @Parameter
    @Deferred
    @IgnorePostback
    private String one;

    @Parameter
    @Deferred
    @IgnorePostback
    private String two;

    @Parameter
    @Deferred
    @IgnorePostback
    private String three;

    @Parameter
    @Deferred
    @IgnorePostback
    private String four;

    @Parameter
    @Deferred
    @IgnorePostback
    private String five;

    @Parameter
    @Deferred
    @IgnorePostback
    private String six;

    @Parameter
    @Deferred
    @IgnorePostback
    private String seven;

    @Parameter
    @Deferred
    @IgnorePostback
    private String eight;

    @Parameter
    @Deferred
    @IgnorePostback
    private String nine;

    @Parameter
    @Deferred
    @IgnorePostback
    private String ten;

    @Parameter
    @Deferred
    @IgnorePostback
    private String eleven;

    @Parameter
    @Deferred
    @IgnorePostback
    private String twelve;

    @Parameter
    @Deferred
    @IgnorePostback
    private String thirteen;

    @Parameter
    @Deferred
    @IgnorePostback
    private String fourteen;

    @Parameter
    @Deferred
    @IgnorePostback
    private String fifteen;

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
