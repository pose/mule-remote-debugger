
package org.mule.tooling.ui.contribution.debugger.view;

public interface IConnectionPropertiesEditor
{
    String getURL();

    int getPort();

    void setURL(String url);

    void setPort(int port);
}
