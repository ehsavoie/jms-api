/*
 * Copyright (c) 2015, 2017 Oracle and/or its affiliates. All rights reserved.
 *
 * This program and the accompanying materials are made available under the
 * terms of the Eclipse Public License v. 2.0, which is available at
 * http://www.eclipse.org/legal/epl-2.0.
 *
 * This Source Code may also be made available under the following Secondary
 * Licenses when the conditions for such availability set forth in the
 * Eclipse Public License v. 2.0 are satisfied: GNU General Public License,
 * version 2 with the GNU Classpath Exception, which is available at
 * https://www.gnu.org/software/classpath/license.html.
 *
 * SPDX-License-Identifier: EPL-2.0 OR GPL-2.0 WITH Classpath-exception-2.0
 */

package javax.jms;

import static java.lang.annotation.ElementType.METHOD;
import static java.lang.annotation.RetentionPolicy.RUNTIME;

import java.lang.annotation.Retention;
import java.lang.annotation.Target;

/**
 * Containing annotation for annotations of type {@code ListenerProperty}.
 *
 * <p>
 * This annotation is used internally when a method or class is annotated with more than one {@code ListenerProperty}
 * annotation. Applications do not need to use this annotation directly.
 *
 * @see ListenerProperty
 * @version Jakarta Messaging 2.1
 * @since JMS 2.1
 */
@Target(METHOD)
@Retention(RUNTIME)
public @interface ListenerProperties {

    ListenerProperty[] value();

}
