/**
 * 
 */
module chbhaltebestand {
    requires transitive jakarta.xml.bind;
    requires jakarta.activation;
    requires java.base;
    requires java.xml;
    exports nl.chb;
    exports nl.chb.binding;
    
    opens nl.chb to jakarta.xml.bind;
}