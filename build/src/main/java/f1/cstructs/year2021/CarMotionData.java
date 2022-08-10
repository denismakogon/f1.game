// Generated by jextract

package f1.cstructs.year2021;

import java.lang.invoke.MethodHandle;
import java.lang.invoke.VarHandle;
import java.nio.ByteOrder;
import java.lang.foreign.*;
import static java.lang.foreign.ValueLayout.*;
public class CarMotionData {

    static final  GroupLayout $struct$LAYOUT = MemoryLayout.structLayout(
        Constants$root.C_FLOAT$LAYOUT.withName("m_worldPositionX"),
        Constants$root.C_FLOAT$LAYOUT.withName("m_worldPositionY"),
        Constants$root.C_FLOAT$LAYOUT.withName("m_worldPositionZ"),
        Constants$root.C_FLOAT$LAYOUT.withName("m_worldVelocityX"),
        Constants$root.C_FLOAT$LAYOUT.withName("m_worldVelocityY"),
        Constants$root.C_FLOAT$LAYOUT.withName("m_worldVelocityZ"),
        Constants$root.C_SHORT$LAYOUT.withName("m_worldForwardDirX"),
        Constants$root.C_SHORT$LAYOUT.withName("m_worldForwardDirY"),
        Constants$root.C_SHORT$LAYOUT.withName("m_worldForwardDirZ"),
        Constants$root.C_SHORT$LAYOUT.withName("m_worldRightDirX"),
        Constants$root.C_SHORT$LAYOUT.withName("m_worldRightDirY"),
        Constants$root.C_SHORT$LAYOUT.withName("m_worldRightDirZ"),
        Constants$root.C_FLOAT$LAYOUT.withName("m_gForceLateral"),
        Constants$root.C_FLOAT$LAYOUT.withName("m_gForceLongitudinal"),
        Constants$root.C_FLOAT$LAYOUT.withName("m_gForceVertical"),
        Constants$root.C_FLOAT$LAYOUT.withName("m_yaw"),
        Constants$root.C_FLOAT$LAYOUT.withName("m_pitch"),
        Constants$root.C_FLOAT$LAYOUT.withName("m_roll")
    ).withName("CarMotionData");
    public static MemoryLayout $LAYOUT() {
        return CarMotionData.$struct$LAYOUT;
    }
    static final VarHandle m_worldPositionX$VH = $struct$LAYOUT.varHandle(MemoryLayout.PathElement.groupElement("m_worldPositionX"));
    public static VarHandle m_worldPositionX$VH() {
        return CarMotionData.m_worldPositionX$VH;
    }
    public static float m_worldPositionX$get(MemorySegment seg) {
        return (float)CarMotionData.m_worldPositionX$VH.get(seg);
    }
    public static void m_worldPositionX$set( MemorySegment seg, float x) {
        CarMotionData.m_worldPositionX$VH.set(seg, x);
    }
    public static float m_worldPositionX$get(MemorySegment seg, long index) {
        return (float)CarMotionData.m_worldPositionX$VH.get(seg.asSlice(index*sizeof()));
    }
    public static void m_worldPositionX$set(MemorySegment seg, long index, float x) {
        CarMotionData.m_worldPositionX$VH.set(seg.asSlice(index*sizeof()), x);
    }
    static final VarHandle m_worldPositionY$VH = $struct$LAYOUT.varHandle(MemoryLayout.PathElement.groupElement("m_worldPositionY"));
    public static VarHandle m_worldPositionY$VH() {
        return CarMotionData.m_worldPositionY$VH;
    }
    public static float m_worldPositionY$get(MemorySegment seg) {
        return (float)CarMotionData.m_worldPositionY$VH.get(seg);
    }
    public static void m_worldPositionY$set( MemorySegment seg, float x) {
        CarMotionData.m_worldPositionY$VH.set(seg, x);
    }
    public static float m_worldPositionY$get(MemorySegment seg, long index) {
        return (float)CarMotionData.m_worldPositionY$VH.get(seg.asSlice(index*sizeof()));
    }
    public static void m_worldPositionY$set(MemorySegment seg, long index, float x) {
        CarMotionData.m_worldPositionY$VH.set(seg.asSlice(index*sizeof()), x);
    }
    static final VarHandle m_worldPositionZ$VH = $struct$LAYOUT.varHandle(MemoryLayout.PathElement.groupElement("m_worldPositionZ"));
    public static VarHandle m_worldPositionZ$VH() {
        return CarMotionData.m_worldPositionZ$VH;
    }
    public static float m_worldPositionZ$get(MemorySegment seg) {
        return (float)CarMotionData.m_worldPositionZ$VH.get(seg);
    }
    public static void m_worldPositionZ$set( MemorySegment seg, float x) {
        CarMotionData.m_worldPositionZ$VH.set(seg, x);
    }
    public static float m_worldPositionZ$get(MemorySegment seg, long index) {
        return (float)CarMotionData.m_worldPositionZ$VH.get(seg.asSlice(index*sizeof()));
    }
    public static void m_worldPositionZ$set(MemorySegment seg, long index, float x) {
        CarMotionData.m_worldPositionZ$VH.set(seg.asSlice(index*sizeof()), x);
    }
    static final VarHandle m_worldVelocityX$VH = $struct$LAYOUT.varHandle(MemoryLayout.PathElement.groupElement("m_worldVelocityX"));
    public static VarHandle m_worldVelocityX$VH() {
        return CarMotionData.m_worldVelocityX$VH;
    }
    public static float m_worldVelocityX$get(MemorySegment seg) {
        return (float)CarMotionData.m_worldVelocityX$VH.get(seg);
    }
    public static void m_worldVelocityX$set( MemorySegment seg, float x) {
        CarMotionData.m_worldVelocityX$VH.set(seg, x);
    }
    public static float m_worldVelocityX$get(MemorySegment seg, long index) {
        return (float)CarMotionData.m_worldVelocityX$VH.get(seg.asSlice(index*sizeof()));
    }
    public static void m_worldVelocityX$set(MemorySegment seg, long index, float x) {
        CarMotionData.m_worldVelocityX$VH.set(seg.asSlice(index*sizeof()), x);
    }
    static final VarHandle m_worldVelocityY$VH = $struct$LAYOUT.varHandle(MemoryLayout.PathElement.groupElement("m_worldVelocityY"));
    public static VarHandle m_worldVelocityY$VH() {
        return CarMotionData.m_worldVelocityY$VH;
    }
    public static float m_worldVelocityY$get(MemorySegment seg) {
        return (float)CarMotionData.m_worldVelocityY$VH.get(seg);
    }
    public static void m_worldVelocityY$set( MemorySegment seg, float x) {
        CarMotionData.m_worldVelocityY$VH.set(seg, x);
    }
    public static float m_worldVelocityY$get(MemorySegment seg, long index) {
        return (float)CarMotionData.m_worldVelocityY$VH.get(seg.asSlice(index*sizeof()));
    }
    public static void m_worldVelocityY$set(MemorySegment seg, long index, float x) {
        CarMotionData.m_worldVelocityY$VH.set(seg.asSlice(index*sizeof()), x);
    }
    static final VarHandle m_worldVelocityZ$VH = $struct$LAYOUT.varHandle(MemoryLayout.PathElement.groupElement("m_worldVelocityZ"));
    public static VarHandle m_worldVelocityZ$VH() {
        return CarMotionData.m_worldVelocityZ$VH;
    }
    public static float m_worldVelocityZ$get(MemorySegment seg) {
        return (float)CarMotionData.m_worldVelocityZ$VH.get(seg);
    }
    public static void m_worldVelocityZ$set( MemorySegment seg, float x) {
        CarMotionData.m_worldVelocityZ$VH.set(seg, x);
    }
    public static float m_worldVelocityZ$get(MemorySegment seg, long index) {
        return (float)CarMotionData.m_worldVelocityZ$VH.get(seg.asSlice(index*sizeof()));
    }
    public static void m_worldVelocityZ$set(MemorySegment seg, long index, float x) {
        CarMotionData.m_worldVelocityZ$VH.set(seg.asSlice(index*sizeof()), x);
    }
    static final VarHandle m_worldForwardDirX$VH = $struct$LAYOUT.varHandle(MemoryLayout.PathElement.groupElement("m_worldForwardDirX"));
    public static VarHandle m_worldForwardDirX$VH() {
        return CarMotionData.m_worldForwardDirX$VH;
    }
    public static short m_worldForwardDirX$get(MemorySegment seg) {
        return (short)CarMotionData.m_worldForwardDirX$VH.get(seg);
    }
    public static void m_worldForwardDirX$set( MemorySegment seg, short x) {
        CarMotionData.m_worldForwardDirX$VH.set(seg, x);
    }
    public static short m_worldForwardDirX$get(MemorySegment seg, long index) {
        return (short)CarMotionData.m_worldForwardDirX$VH.get(seg.asSlice(index*sizeof()));
    }
    public static void m_worldForwardDirX$set(MemorySegment seg, long index, short x) {
        CarMotionData.m_worldForwardDirX$VH.set(seg.asSlice(index*sizeof()), x);
    }
    static final VarHandle m_worldForwardDirY$VH = $struct$LAYOUT.varHandle(MemoryLayout.PathElement.groupElement("m_worldForwardDirY"));
    public static VarHandle m_worldForwardDirY$VH() {
        return CarMotionData.m_worldForwardDirY$VH;
    }
    public static short m_worldForwardDirY$get(MemorySegment seg) {
        return (short)CarMotionData.m_worldForwardDirY$VH.get(seg);
    }
    public static void m_worldForwardDirY$set( MemorySegment seg, short x) {
        CarMotionData.m_worldForwardDirY$VH.set(seg, x);
    }
    public static short m_worldForwardDirY$get(MemorySegment seg, long index) {
        return (short)CarMotionData.m_worldForwardDirY$VH.get(seg.asSlice(index*sizeof()));
    }
    public static void m_worldForwardDirY$set(MemorySegment seg, long index, short x) {
        CarMotionData.m_worldForwardDirY$VH.set(seg.asSlice(index*sizeof()), x);
    }
    static final VarHandle m_worldForwardDirZ$VH = $struct$LAYOUT.varHandle(MemoryLayout.PathElement.groupElement("m_worldForwardDirZ"));
    public static VarHandle m_worldForwardDirZ$VH() {
        return CarMotionData.m_worldForwardDirZ$VH;
    }
    public static short m_worldForwardDirZ$get(MemorySegment seg) {
        return (short)CarMotionData.m_worldForwardDirZ$VH.get(seg);
    }
    public static void m_worldForwardDirZ$set( MemorySegment seg, short x) {
        CarMotionData.m_worldForwardDirZ$VH.set(seg, x);
    }
    public static short m_worldForwardDirZ$get(MemorySegment seg, long index) {
        return (short)CarMotionData.m_worldForwardDirZ$VH.get(seg.asSlice(index*sizeof()));
    }
    public static void m_worldForwardDirZ$set(MemorySegment seg, long index, short x) {
        CarMotionData.m_worldForwardDirZ$VH.set(seg.asSlice(index*sizeof()), x);
    }
    static final VarHandle m_worldRightDirX$VH = $struct$LAYOUT.varHandle(MemoryLayout.PathElement.groupElement("m_worldRightDirX"));
    public static VarHandle m_worldRightDirX$VH() {
        return CarMotionData.m_worldRightDirX$VH;
    }
    public static short m_worldRightDirX$get(MemorySegment seg) {
        return (short)CarMotionData.m_worldRightDirX$VH.get(seg);
    }
    public static void m_worldRightDirX$set( MemorySegment seg, short x) {
        CarMotionData.m_worldRightDirX$VH.set(seg, x);
    }
    public static short m_worldRightDirX$get(MemorySegment seg, long index) {
        return (short)CarMotionData.m_worldRightDirX$VH.get(seg.asSlice(index*sizeof()));
    }
    public static void m_worldRightDirX$set(MemorySegment seg, long index, short x) {
        CarMotionData.m_worldRightDirX$VH.set(seg.asSlice(index*sizeof()), x);
    }
    static final VarHandle m_worldRightDirY$VH = $struct$LAYOUT.varHandle(MemoryLayout.PathElement.groupElement("m_worldRightDirY"));
    public static VarHandle m_worldRightDirY$VH() {
        return CarMotionData.m_worldRightDirY$VH;
    }
    public static short m_worldRightDirY$get(MemorySegment seg) {
        return (short)CarMotionData.m_worldRightDirY$VH.get(seg);
    }
    public static void m_worldRightDirY$set( MemorySegment seg, short x) {
        CarMotionData.m_worldRightDirY$VH.set(seg, x);
    }
    public static short m_worldRightDirY$get(MemorySegment seg, long index) {
        return (short)CarMotionData.m_worldRightDirY$VH.get(seg.asSlice(index*sizeof()));
    }
    public static void m_worldRightDirY$set(MemorySegment seg, long index, short x) {
        CarMotionData.m_worldRightDirY$VH.set(seg.asSlice(index*sizeof()), x);
    }
    static final VarHandle m_worldRightDirZ$VH = $struct$LAYOUT.varHandle(MemoryLayout.PathElement.groupElement("m_worldRightDirZ"));
    public static VarHandle m_worldRightDirZ$VH() {
        return CarMotionData.m_worldRightDirZ$VH;
    }
    public static short m_worldRightDirZ$get(MemorySegment seg) {
        return (short)CarMotionData.m_worldRightDirZ$VH.get(seg);
    }
    public static void m_worldRightDirZ$set( MemorySegment seg, short x) {
        CarMotionData.m_worldRightDirZ$VH.set(seg, x);
    }
    public static short m_worldRightDirZ$get(MemorySegment seg, long index) {
        return (short)CarMotionData.m_worldRightDirZ$VH.get(seg.asSlice(index*sizeof()));
    }
    public static void m_worldRightDirZ$set(MemorySegment seg, long index, short x) {
        CarMotionData.m_worldRightDirZ$VH.set(seg.asSlice(index*sizeof()), x);
    }
    static final VarHandle m_gForceLateral$VH = $struct$LAYOUT.varHandle(MemoryLayout.PathElement.groupElement("m_gForceLateral"));
    public static VarHandle m_gForceLateral$VH() {
        return CarMotionData.m_gForceLateral$VH;
    }
    public static float m_gForceLateral$get(MemorySegment seg) {
        return (float)CarMotionData.m_gForceLateral$VH.get(seg);
    }
    public static void m_gForceLateral$set( MemorySegment seg, float x) {
        CarMotionData.m_gForceLateral$VH.set(seg, x);
    }
    public static float m_gForceLateral$get(MemorySegment seg, long index) {
        return (float)CarMotionData.m_gForceLateral$VH.get(seg.asSlice(index*sizeof()));
    }
    public static void m_gForceLateral$set(MemorySegment seg, long index, float x) {
        CarMotionData.m_gForceLateral$VH.set(seg.asSlice(index*sizeof()), x);
    }
    static final VarHandle m_gForceLongitudinal$VH = $struct$LAYOUT.varHandle(MemoryLayout.PathElement.groupElement("m_gForceLongitudinal"));
    public static VarHandle m_gForceLongitudinal$VH() {
        return CarMotionData.m_gForceLongitudinal$VH;
    }
    public static float m_gForceLongitudinal$get(MemorySegment seg) {
        return (float)CarMotionData.m_gForceLongitudinal$VH.get(seg);
    }
    public static void m_gForceLongitudinal$set( MemorySegment seg, float x) {
        CarMotionData.m_gForceLongitudinal$VH.set(seg, x);
    }
    public static float m_gForceLongitudinal$get(MemorySegment seg, long index) {
        return (float)CarMotionData.m_gForceLongitudinal$VH.get(seg.asSlice(index*sizeof()));
    }
    public static void m_gForceLongitudinal$set(MemorySegment seg, long index, float x) {
        CarMotionData.m_gForceLongitudinal$VH.set(seg.asSlice(index*sizeof()), x);
    }
    static final VarHandle m_gForceVertical$VH = $struct$LAYOUT.varHandle(MemoryLayout.PathElement.groupElement("m_gForceVertical"));
    public static VarHandle m_gForceVertical$VH() {
        return CarMotionData.m_gForceVertical$VH;
    }
    public static float m_gForceVertical$get(MemorySegment seg) {
        return (float)CarMotionData.m_gForceVertical$VH.get(seg);
    }
    public static void m_gForceVertical$set( MemorySegment seg, float x) {
        CarMotionData.m_gForceVertical$VH.set(seg, x);
    }
    public static float m_gForceVertical$get(MemorySegment seg, long index) {
        return (float)CarMotionData.m_gForceVertical$VH.get(seg.asSlice(index*sizeof()));
    }
    public static void m_gForceVertical$set(MemorySegment seg, long index, float x) {
        CarMotionData.m_gForceVertical$VH.set(seg.asSlice(index*sizeof()), x);
    }
    static final VarHandle m_yaw$VH = $struct$LAYOUT.varHandle(MemoryLayout.PathElement.groupElement("m_yaw"));
    public static VarHandle m_yaw$VH() {
        return CarMotionData.m_yaw$VH;
    }
    public static float m_yaw$get(MemorySegment seg) {
        return (float)CarMotionData.m_yaw$VH.get(seg);
    }
    public static void m_yaw$set( MemorySegment seg, float x) {
        CarMotionData.m_yaw$VH.set(seg, x);
    }
    public static float m_yaw$get(MemorySegment seg, long index) {
        return (float)CarMotionData.m_yaw$VH.get(seg.asSlice(index*sizeof()));
    }
    public static void m_yaw$set(MemorySegment seg, long index, float x) {
        CarMotionData.m_yaw$VH.set(seg.asSlice(index*sizeof()), x);
    }
    static final VarHandle m_pitch$VH = $struct$LAYOUT.varHandle(MemoryLayout.PathElement.groupElement("m_pitch"));
    public static VarHandle m_pitch$VH() {
        return CarMotionData.m_pitch$VH;
    }
    public static float m_pitch$get(MemorySegment seg) {
        return (float)CarMotionData.m_pitch$VH.get(seg);
    }
    public static void m_pitch$set( MemorySegment seg, float x) {
        CarMotionData.m_pitch$VH.set(seg, x);
    }
    public static float m_pitch$get(MemorySegment seg, long index) {
        return (float)CarMotionData.m_pitch$VH.get(seg.asSlice(index*sizeof()));
    }
    public static void m_pitch$set(MemorySegment seg, long index, float x) {
        CarMotionData.m_pitch$VH.set(seg.asSlice(index*sizeof()), x);
    }
    static final VarHandle m_roll$VH = $struct$LAYOUT.varHandle(MemoryLayout.PathElement.groupElement("m_roll"));
    public static VarHandle m_roll$VH() {
        return CarMotionData.m_roll$VH;
    }
    public static float m_roll$get(MemorySegment seg) {
        return (float)CarMotionData.m_roll$VH.get(seg);
    }
    public static void m_roll$set( MemorySegment seg, float x) {
        CarMotionData.m_roll$VH.set(seg, x);
    }
    public static float m_roll$get(MemorySegment seg, long index) {
        return (float)CarMotionData.m_roll$VH.get(seg.asSlice(index*sizeof()));
    }
    public static void m_roll$set(MemorySegment seg, long index, float x) {
        CarMotionData.m_roll$VH.set(seg.asSlice(index*sizeof()), x);
    }
    public static long sizeof() { return $LAYOUT().byteSize(); }
    public static MemorySegment allocate(SegmentAllocator allocator) { return allocator.allocate($LAYOUT()); }
    public static MemorySegment allocateArray(int len, SegmentAllocator allocator) {
        return allocator.allocate(MemoryLayout.sequenceLayout(len, $LAYOUT()));
    }
    public static MemorySegment ofAddress(MemoryAddress addr, MemorySession session) { return RuntimeHelper.asArray(addr, $LAYOUT(), 1, session); }
}


