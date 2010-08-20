/**
 * 
 */
package org.vimeoid.dto;

/**
 * <dl>
 * <dt>Project:</dt> <dd>vimeoid</dd>
 * <dt>Package:</dt> <dd>org.vimeoid.dto</dd>
 * </dl>
 *
 * <code>ChannelInfo</code>
 *
 * <p>Vimeo channel representation</p>
 *
 * @author Ulric Wilfred <shaman.sir@gmail.com>
 * @date Aug 19, 2010 8:56:39 PM 
 *
 */
public class ChannelInfo {

    public int id;
    public String name;
    public String description;
    
    public String logoHeader;
    public String pageUrl;
    public String rssUrl;
    
    public /*long*/ String createdOn;
    public int creatorId;
    public String creatorDisplayName;
    public String creatorProfileUrl;
    
    public int videosCount;
    public int subscribersCount;
    
}
