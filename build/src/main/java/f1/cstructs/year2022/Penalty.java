// Generated by jextract

package f1.cstructs.year2022;

import java.lang.invoke.MethodHandle;
import java.lang.invoke.VarHandle;
import java.nio.ByteOrder;
import java.lang.foreign.*;
import static java.lang.foreign.ValueLayout.*;
public class Penalty {

    static final  GroupLayout $struct$LAYOUT = MemoryLayout.structLayout(
        Constants$root.C_CHAR$LAYOUT.withName("penaltyType"),
        Constants$root.C_CHAR$LAYOUT.withName("infringementType"),
        Constants$root.C_CHAR$LAYOUT.withName("vehicleIdx"),
        Constants$root.C_CHAR$LAYOUT.withName("otherVehicleIdx"),
        Constants$root.C_CHAR$LAYOUT.withName("time"),
        Constants$root.C_CHAR$LAYOUT.withName("lapNum"),
        Constants$root.C_CHAR$LAYOUT.withName("placesGained")
    ).withName("Penalty");
    public static MemoryLayout $LAYOUT() {
        return Penalty.$struct$LAYOUT;
    }
    static final VarHandle penaltyType$VH = $struct$LAYOUT.varHandle(MemoryLayout.PathElement.groupElement("penaltyType"));
    public static VarHandle penaltyType$VH() {
        return Penalty.penaltyType$VH;
    }
    public static byte penaltyType$get(MemorySegment seg) {
        return (byte)Penalty.penaltyType$VH.get(seg);
    }
    public static void penaltyType$set( MemorySegment seg, byte x) {
        Penalty.penaltyType$VH.set(seg, x);
    }
    public static byte penaltyType$get(MemorySegment seg, long index) {
        return (byte)Penalty.penaltyType$VH.get(seg.asSlice(index*sizeof()));
    }
    public static void penaltyType$set(MemorySegment seg, long index, byte x) {
        Penalty.penaltyType$VH.set(seg.asSlice(index*sizeof()), x);
    }
    static final VarHandle infringementType$VH = $struct$LAYOUT.varHandle(MemoryLayout.PathElement.groupElement("infringementType"));
    public static VarHandle infringementType$VH() {
        return Penalty.infringementType$VH;
    }
    public static byte infringementType$get(MemorySegment seg) {
        return (byte)Penalty.infringementType$VH.get(seg);
    }
    public static void infringementType$set( MemorySegment seg, byte x) {
        Penalty.infringementType$VH.set(seg, x);
    }
    public static byte infringementType$get(MemorySegment seg, long index) {
        return (byte)Penalty.infringementType$VH.get(seg.asSlice(index*sizeof()));
    }
    public static void infringementType$set(MemorySegment seg, long index, byte x) {
        Penalty.infringementType$VH.set(seg.asSlice(index*sizeof()), x);
    }
    static final VarHandle vehicleIdx$VH = $struct$LAYOUT.varHandle(MemoryLayout.PathElement.groupElement("vehicleIdx"));
    public static VarHandle vehicleIdx$VH() {
        return Penalty.vehicleIdx$VH;
    }
    public static byte vehicleIdx$get(MemorySegment seg) {
        return (byte)Penalty.vehicleIdx$VH.get(seg);
    }
    public static void vehicleIdx$set( MemorySegment seg, byte x) {
        Penalty.vehicleIdx$VH.set(seg, x);
    }
    public static byte vehicleIdx$get(MemorySegment seg, long index) {
        return (byte)Penalty.vehicleIdx$VH.get(seg.asSlice(index*sizeof()));
    }
    public static void vehicleIdx$set(MemorySegment seg, long index, byte x) {
        Penalty.vehicleIdx$VH.set(seg.asSlice(index*sizeof()), x);
    }
    static final VarHandle otherVehicleIdx$VH = $struct$LAYOUT.varHandle(MemoryLayout.PathElement.groupElement("otherVehicleIdx"));
    public static VarHandle otherVehicleIdx$VH() {
        return Penalty.otherVehicleIdx$VH;
    }
    public static byte otherVehicleIdx$get(MemorySegment seg) {
        return (byte)Penalty.otherVehicleIdx$VH.get(seg);
    }
    public static void otherVehicleIdx$set( MemorySegment seg, byte x) {
        Penalty.otherVehicleIdx$VH.set(seg, x);
    }
    public static byte otherVehicleIdx$get(MemorySegment seg, long index) {
        return (byte)Penalty.otherVehicleIdx$VH.get(seg.asSlice(index*sizeof()));
    }
    public static void otherVehicleIdx$set(MemorySegment seg, long index, byte x) {
        Penalty.otherVehicleIdx$VH.set(seg.asSlice(index*sizeof()), x);
    }
    static final VarHandle time$VH = $struct$LAYOUT.varHandle(MemoryLayout.PathElement.groupElement("time"));
    public static VarHandle time$VH() {
        return Penalty.time$VH;
    }
    public static byte time$get(MemorySegment seg) {
        return (byte)Penalty.time$VH.get(seg);
    }
    public static void time$set( MemorySegment seg, byte x) {
        Penalty.time$VH.set(seg, x);
    }
    public static byte time$get(MemorySegment seg, long index) {
        return (byte)Penalty.time$VH.get(seg.asSlice(index*sizeof()));
    }
    public static void time$set(MemorySegment seg, long index, byte x) {
        Penalty.time$VH.set(seg.asSlice(index*sizeof()), x);
    }
    static final VarHandle lapNum$VH = $struct$LAYOUT.varHandle(MemoryLayout.PathElement.groupElement("lapNum"));
    public static VarHandle lapNum$VH() {
        return Penalty.lapNum$VH;
    }
    public static byte lapNum$get(MemorySegment seg) {
        return (byte)Penalty.lapNum$VH.get(seg);
    }
    public static void lapNum$set( MemorySegment seg, byte x) {
        Penalty.lapNum$VH.set(seg, x);
    }
    public static byte lapNum$get(MemorySegment seg, long index) {
        return (byte)Penalty.lapNum$VH.get(seg.asSlice(index*sizeof()));
    }
    public static void lapNum$set(MemorySegment seg, long index, byte x) {
        Penalty.lapNum$VH.set(seg.asSlice(index*sizeof()), x);
    }
    static final VarHandle placesGained$VH = $struct$LAYOUT.varHandle(MemoryLayout.PathElement.groupElement("placesGained"));
    public static VarHandle placesGained$VH() {
        return Penalty.placesGained$VH;
    }
    public static byte placesGained$get(MemorySegment seg) {
        return (byte)Penalty.placesGained$VH.get(seg);
    }
    public static void placesGained$set( MemorySegment seg, byte x) {
        Penalty.placesGained$VH.set(seg, x);
    }
    public static byte placesGained$get(MemorySegment seg, long index) {
        return (byte)Penalty.placesGained$VH.get(seg.asSlice(index*sizeof()));
    }
    public static void placesGained$set(MemorySegment seg, long index, byte x) {
        Penalty.placesGained$VH.set(seg.asSlice(index*sizeof()), x);
    }
    public static long sizeof() { return $LAYOUT().byteSize(); }
    public static MemorySegment allocate(SegmentAllocator allocator) { return allocator.allocate($LAYOUT()); }
    public static MemorySegment allocateArray(int len, SegmentAllocator allocator) {
        return allocator.allocate(MemoryLayout.sequenceLayout(len, $LAYOUT()));
    }
    public static MemorySegment ofAddress(MemoryAddress addr, MemorySession session) { return RuntimeHelper.asArray(addr, $LAYOUT(), 1, session); }
}


