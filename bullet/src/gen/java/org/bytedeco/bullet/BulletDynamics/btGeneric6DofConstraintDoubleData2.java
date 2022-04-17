// Targeted by JavaCPP version 1.5.8-SNAPSHOT: DO NOT EDIT THIS FILE

package org.bytedeco.bullet.BulletDynamics;

import java.nio.*;
import org.bytedeco.javacpp.*;
import org.bytedeco.javacpp.annotation.*;

import static org.bytedeco.javacpp.presets.javacpp.*;
import org.bytedeco.bullet.LinearMath.*;
import static org.bytedeco.bullet.global.LinearMath.*;
import org.bytedeco.bullet.BulletCollision.*;
import static org.bytedeco.bullet.global.BulletCollision.*;

import static org.bytedeco.bullet.global.BulletDynamics.*;


@Properties(inherit = org.bytedeco.bullet.presets.BulletDynamics.class)
public class btGeneric6DofConstraintDoubleData2 extends Pointer {
    static { Loader.load(); }
    /** Default native constructor. */
    public btGeneric6DofConstraintDoubleData2() { super((Pointer)null); allocate(); }
    /** Native array allocator. Access with {@link Pointer#position(long)}. */
    public btGeneric6DofConstraintDoubleData2(long size) { super((Pointer)null); allocateArray(size); }
    /** Pointer cast constructor. Invokes {@link Pointer#Pointer(Pointer)}. */
    public btGeneric6DofConstraintDoubleData2(Pointer p) { super(p); }
    private native void allocate();
    private native void allocateArray(long size);
    @Override public btGeneric6DofConstraintDoubleData2 position(long position) {
        return (btGeneric6DofConstraintDoubleData2)super.position(position);
    }
    @Override public btGeneric6DofConstraintDoubleData2 getPointer(long i) {
        return new btGeneric6DofConstraintDoubleData2((Pointer)this).offsetAddress(i);
    }

	public native @ByRef btTypedConstraintDoubleData m_typeConstraintData(); public native btGeneric6DofConstraintDoubleData2 m_typeConstraintData(btTypedConstraintDoubleData setter);
	public native @ByRef btTransformDoubleData m_rbAFrame(); public native btGeneric6DofConstraintDoubleData2 m_rbAFrame(btTransformDoubleData setter);  // constraint axii. Assumes z is hinge axis.
	public native @ByRef btTransformDoubleData m_rbBFrame(); public native btGeneric6DofConstraintDoubleData2 m_rbBFrame(btTransformDoubleData setter);

	public native @ByRef btVector3DoubleData m_linearUpperLimit(); public native btGeneric6DofConstraintDoubleData2 m_linearUpperLimit(btVector3DoubleData setter);
	public native @ByRef btVector3DoubleData m_linearLowerLimit(); public native btGeneric6DofConstraintDoubleData2 m_linearLowerLimit(btVector3DoubleData setter);

	public native @ByRef btVector3DoubleData m_angularUpperLimit(); public native btGeneric6DofConstraintDoubleData2 m_angularUpperLimit(btVector3DoubleData setter);
	public native @ByRef btVector3DoubleData m_angularLowerLimit(); public native btGeneric6DofConstraintDoubleData2 m_angularLowerLimit(btVector3DoubleData setter);

	public native int m_useLinearReferenceFrameA(); public native btGeneric6DofConstraintDoubleData2 m_useLinearReferenceFrameA(int setter);
	public native int m_useOffsetForConstraintFrame(); public native btGeneric6DofConstraintDoubleData2 m_useOffsetForConstraintFrame(int setter);
}