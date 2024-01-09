/**
 * 
 */
module chbhaltebestand {
    requires jakarta.xml.bind;
//    requires jakarta.xml;
    requires jakarta.activation;
    requires java.base;
//    requires java.xml;
    exports nl.chb;
    
    opens nl.chb to jakarta.xml.bind;
}