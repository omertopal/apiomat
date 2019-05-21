/*
 * Copyright (c) 2011 - 2019, Apinauten GmbH
 * All rights reserved.
 *
 * Redistribution and use in source and binary forms, with or without modification,
 * are permitted provided that the following conditions are met:
 *
 *  * Redistributions of source code must retain the above copyright notice, this
 *    list of conditions and the following disclaimer.
 *  * Redistributions in binary form must reproduce the above copyright notice,
 *    this list of conditions and the following disclaimer in the documentation
 *    and/or other materials provided with the distribution.
 *
 * THIS SOFTWARE IS PROVIDED BY THE COPYRIGHT HOLDERS AND CONTRIBUTORS "AS IS" AND
 * ANY EXPRESS OR IMPLIED WARRANTIES, INCLUDING, BUT NOT LIMITED TO, THE IMPLIED
 * WARRANTIES OF MERCHANTABILITY AND FITNESS FOR A PARTICULAR PURPOSE ARE DISCLAIMED.
 * IN NO EVENT SHALL THE COPYRIGHT HOLDER OR CONTRIBUTORS BE LIABLE FOR ANY DIRECT,
 * INDIRECT, INCIDENTAL, SPECIAL, EXEMPLARY, OR CONSEQUENTIAL DAMAGES (INCLUDING,
 * BUT NOT LIMITED TO, PROCUREMENT OF SUBSTITUTE GOODS OR SERVICES; LOSS OF USE,
 * DATA, OR PROFITS; OR BUSINESS INTERRUPTION) HOWEVER CAUSED AND ON ANY THEORY OF
 * LIABILITY, WHETHER IN CONTRACT, STRICT LIABILITY, OR TORT (INCLUDING NEGLIGENCE
 * OR OTHERWISE) ARISING IN ANY WAY OUT OF THE USE OF THIS SOFTWARE, EVEN IF ADVISED
 * OF THE POSSIBILITY OF SUCH DAMAGE.
 */
package com.apiomat.nativemodule.salesmodule3_1;


import com.apiomat.nativemodule.basics.*;
/**
* Generated class for your ContactProtocol data model
*
* DO NOT CHANGE ANY CODE EXCEPT CLASS ANNOTATIONS OR CLASS ATTRIBUTES HERE!
* EVERYTHING ELSE WILL GET OVERWRITTEN!
*
*/
@java.lang.SuppressWarnings( "unused" )
@com.apiomat.nativemodule.Model( moduleName = "SalesModule3_1",
    hooksClassNameTransient = "com.apiomat.nativemodule.salesmodule3_1.ContactProtocolHooksTransient", 
    hooksClassNameNonTransient = "com.apiomat.nativemodule.salesmodule3_1.ContactProtocolHooksNonTransient", 
    isTransient = false,     requiredUserRoleCreate=com.apiomat.nativemodule.UserRole.User, requiredUserRoleRead=com.apiomat.nativemodule.UserRole.User,
    requiredUserRoleWrite=com.apiomat.nativemodule.UserRole.Owner, restrictResourceAccess=false,    allowedRolesCreate={}, allowedRolesRead={},
    allowedRolesWrite={}, allowedRolesGrant={}, 
    roleClassesMap={})
public class ContactProtocol extends com.apiomat.nativemodule.AbstractClientDataModel<com.apiomat.nativemodule.salesmodule3_1.ContactProtocol> implements com.apiomat.nativemodule.IModel<com.apiomat.nativemodule.salesmodule3_1.ContactProtocol>
{
    /**
     * Contains the name of the module that this model belongs to
     */
    public static final String MODULE_NAME = "SalesModule3_1";
    /**
     * Contains the name of the model
     */
    public static final String MODEL_NAME = "ContactProtocol";

    /** class specific attributes */
    private String notes = null;
    private java.util.Date timeOfContact = null;
    /**
     * Protected constructor; to create a new instance, use the createObject() method
     */
    public ContactProtocol ()
    {}

    /**
     * Returns the name of the module where this class belongs to
     */
    @Override
    public String getModuleName( )
    {
        return MODULE_NAME;
    }

    /**
     * Returns the name of the model
     */
    @Override
    public String getModelName( )
    {
        return MODEL_NAME;
    }

    public String getNotes()
    {
         return this.notes;
    }

    public void setNotes( String arg )
    {
        this.notes = arg;
    }

    public java.util.Date getTimeOfContact()
    {
         return this.timeOfContact;
    }

    public void setTimeOfContact( java.util.Date arg )
    {
        this.timeOfContact = arg;
    }

}
