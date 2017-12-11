/**
 * Copyright (c) 2017 Kichwa Coders Ltd. and others.
 * All rights reserved. This program and the accompanying materials
 * are made available under the terms of the Eclipse Public License v1.0
 * which accompanies this distribution, and is available at
 * http://www.eclipse.org/legal/epl-v10.html
 */
package org.eclipse.lsp4j.debug;

import org.eclipse.lsp4j.jsonrpc.validation.NonNull;
import org.eclipse.xtext.xbase.lib.Pure;
import org.eclipse.xtext.xbase.lib.util.ToStringBuilder;

/**
 * Arguments for 'goto' request.
 */
@SuppressWarnings("all")
public class GotoArguments {
  /**
   * Set the goto target for this thread.
   */
  @NonNull
  private Integer threadId;
  
  /**
   * The location where the debuggee will continue to run.
   */
  @NonNull
  private Integer targetId;
  
  /**
   * Set the goto target for this thread.
   */
  @Pure
  @NonNull
  public Integer getThreadId() {
    return this.threadId;
  }
  
  /**
   * Set the goto target for this thread.
   */
  public void setThreadId(@NonNull final Integer threadId) {
    this.threadId = threadId;
  }
  
  /**
   * The location where the debuggee will continue to run.
   */
  @Pure
  @NonNull
  public Integer getTargetId() {
    return this.targetId;
  }
  
  /**
   * The location where the debuggee will continue to run.
   */
  public void setTargetId(@NonNull final Integer targetId) {
    this.targetId = targetId;
  }
  
  @Override
  @Pure
  public String toString() {
    ToStringBuilder b = new ToStringBuilder(this);
    b.add("threadId", this.threadId);
    b.add("targetId", this.targetId);
    return b.toString();
  }
  
  @Override
  @Pure
  public boolean equals(final Object obj) {
    if (this == obj)
      return true;
    if (obj == null)
      return false;
    if (getClass() != obj.getClass())
      return false;
    GotoArguments other = (GotoArguments) obj;
    if (this.threadId == null) {
      if (other.threadId != null)
        return false;
    } else if (!this.threadId.equals(other.threadId))
      return false;
    if (this.targetId == null) {
      if (other.targetId != null)
        return false;
    } else if (!this.targetId.equals(other.targetId))
      return false;
    return true;
  }
  
  @Override
  @Pure
  public int hashCode() {
    final int prime = 31;
    int result = 1;
    result = prime * result + ((this.threadId== null) ? 0 : this.threadId.hashCode());
    result = prime * result + ((this.targetId== null) ? 0 : this.targetId.hashCode());
    return result;
  }
}
