package defpackage;

import android.hardware.camera2.CameraCharacteristics;
import android.hardware.camera2.params.StreamConfigurationMap;
import android.util.Range;
import android.util.Size;
import java.util.ArrayList;
import java.util.Collection;
import java.util.Iterator;
import java.util.List;

/* JADX INFO: compiled from: r8-map-id-c0f90335ad52c1b57db77aaf4b1db5c7c9c2627f2e01f059a43261b6162c0147 */
/* JADX INFO: loaded from: classes.dex */
public final class uj6 {
    public static final Range f = new Range(120, 120);
    public final yg1 a;
    public final ace b;
    public final ace c;
    public final ace d;
    public final ace e;

    public uj6(yg1 yg1Var) {
        yg1Var.getClass();
        this.a = yg1Var;
        final int i = 0;
        this.b = new ace(new x16(this) { // from class: tj6
            public final /* synthetic */ uj6 b;

            {
                this.b = this;
            }

            @Override // defpackage.x16
            public final Object invoke() {
                int i2 = i;
                uj6 uj6Var = this.b;
                switch (i2) {
                    case 0:
                        yg1 yg1Var2 = uj6Var.a;
                        CameraCharacteristics.Key key = CameraCharacteristics.REQUEST_AVAILABLE_CAPABILITIES;
                        key.getClass();
                        int[] iArr = (int[]) ((nc1) yg1Var2).c(key);
                        boolean z = false;
                        if (iArr != null) {
                            for (int i3 : iArr) {
                                if (i3 == 9) {
                                    z = true;
                                }
                            }
                        }
                        return Boolean.valueOf(z);
                    case 1:
                        List list = (List) uj6Var.e.getValue();
                        if (list.isEmpty()) {
                            list = null;
                        }
                        if (list == null) {
                            return null;
                        }
                        Iterator it = list.iterator();
                        if (!it.hasNext()) {
                            s8f.c();
                            return null;
                        }
                        Object next = it.next();
                        if (it.hasNext()) {
                            int iA = jld.a((Size) next);
                            do {
                                Object next2 = it.next();
                                int iA2 = jld.a((Size) next2);
                                if (iA < iA2) {
                                    next = next2;
                                    iA = iA2;
                                }
                            } while (it.hasNext());
                        }
                        return (Size) next;
                    case 2:
                        yg1 yg1Var3 = uj6Var.a;
                        CameraCharacteristics.Key key2 = CameraCharacteristics.SCALER_STREAM_CONFIGURATION_MAP;
                        key2.getClass();
                        StreamConfigurationMap streamConfigurationMap = (StreamConfigurationMap) ((nc1) yg1Var3).c(key2);
                        if (streamConfigurationMap != null) {
                            return new w2e(streamConfigurationMap, new ut9(yg1Var3));
                        }
                        qc0.j("Cannot retrieve SCALER_STREAM_CONFIGURATION_MAP");
                        return null;
                    default:
                        StreamConfigurationMap streamConfigurationMap2 = (StreamConfigurationMap) ((w2e) uj6Var.d.getValue()).d.b;
                        Size[] highSpeedVideoSizes = streamConfigurationMap2 != null ? streamConfigurationMap2.getHighSpeedVideoSizes() : null;
                        return highSpeedVideoSizes != null ? qd0.G0(highSpeedVideoSizes) : pu4.a;
                }
            }
        });
        final int i2 = 1;
        this.c = new ace(new x16(this) { // from class: tj6
            public final /* synthetic */ uj6 b;

            {
                this.b = this;
            }

            @Override // defpackage.x16
            public final Object invoke() {
                int i3 = i2;
                uj6 uj6Var = this.b;
                switch (i3) {
                    case 0:
                        yg1 yg1Var2 = uj6Var.a;
                        CameraCharacteristics.Key key = CameraCharacteristics.REQUEST_AVAILABLE_CAPABILITIES;
                        key.getClass();
                        int[] iArr = (int[]) ((nc1) yg1Var2).c(key);
                        boolean z = false;
                        if (iArr != null) {
                            for (int i4 : iArr) {
                                if (i4 == 9) {
                                    z = true;
                                }
                            }
                        }
                        return Boolean.valueOf(z);
                    case 1:
                        List list = (List) uj6Var.e.getValue();
                        if (list.isEmpty()) {
                            list = null;
                        }
                        if (list == null) {
                            return null;
                        }
                        Iterator it = list.iterator();
                        if (!it.hasNext()) {
                            s8f.c();
                            return null;
                        }
                        Object next = it.next();
                        if (it.hasNext()) {
                            int iA = jld.a((Size) next);
                            do {
                                Object next2 = it.next();
                                int iA2 = jld.a((Size) next2);
                                if (iA < iA2) {
                                    next = next2;
                                    iA = iA2;
                                }
                            } while (it.hasNext());
                        }
                        return (Size) next;
                    case 2:
                        yg1 yg1Var3 = uj6Var.a;
                        CameraCharacteristics.Key key2 = CameraCharacteristics.SCALER_STREAM_CONFIGURATION_MAP;
                        key2.getClass();
                        StreamConfigurationMap streamConfigurationMap = (StreamConfigurationMap) ((nc1) yg1Var3).c(key2);
                        if (streamConfigurationMap != null) {
                            return new w2e(streamConfigurationMap, new ut9(yg1Var3));
                        }
                        qc0.j("Cannot retrieve SCALER_STREAM_CONFIGURATION_MAP");
                        return null;
                    default:
                        StreamConfigurationMap streamConfigurationMap2 = (StreamConfigurationMap) ((w2e) uj6Var.d.getValue()).d.b;
                        Size[] highSpeedVideoSizes = streamConfigurationMap2 != null ? streamConfigurationMap2.getHighSpeedVideoSizes() : null;
                        return highSpeedVideoSizes != null ? qd0.G0(highSpeedVideoSizes) : pu4.a;
                }
            }
        });
        final int i3 = 2;
        this.d = new ace(new x16(this) { // from class: tj6
            public final /* synthetic */ uj6 b;

            {
                this.b = this;
            }

            @Override // defpackage.x16
            public final Object invoke() {
                int i4 = i3;
                uj6 uj6Var = this.b;
                switch (i4) {
                    case 0:
                        yg1 yg1Var2 = uj6Var.a;
                        CameraCharacteristics.Key key = CameraCharacteristics.REQUEST_AVAILABLE_CAPABILITIES;
                        key.getClass();
                        int[] iArr = (int[]) ((nc1) yg1Var2).c(key);
                        boolean z = false;
                        if (iArr != null) {
                            for (int i5 : iArr) {
                                if (i5 == 9) {
                                    z = true;
                                }
                            }
                        }
                        return Boolean.valueOf(z);
                    case 1:
                        List list = (List) uj6Var.e.getValue();
                        if (list.isEmpty()) {
                            list = null;
                        }
                        if (list == null) {
                            return null;
                        }
                        Iterator it = list.iterator();
                        if (!it.hasNext()) {
                            s8f.c();
                            return null;
                        }
                        Object next = it.next();
                        if (it.hasNext()) {
                            int iA = jld.a((Size) next);
                            do {
                                Object next2 = it.next();
                                int iA2 = jld.a((Size) next2);
                                if (iA < iA2) {
                                    next = next2;
                                    iA = iA2;
                                }
                            } while (it.hasNext());
                        }
                        return (Size) next;
                    case 2:
                        yg1 yg1Var3 = uj6Var.a;
                        CameraCharacteristics.Key key2 = CameraCharacteristics.SCALER_STREAM_CONFIGURATION_MAP;
                        key2.getClass();
                        StreamConfigurationMap streamConfigurationMap = (StreamConfigurationMap) ((nc1) yg1Var3).c(key2);
                        if (streamConfigurationMap != null) {
                            return new w2e(streamConfigurationMap, new ut9(yg1Var3));
                        }
                        qc0.j("Cannot retrieve SCALER_STREAM_CONFIGURATION_MAP");
                        return null;
                    default:
                        StreamConfigurationMap streamConfigurationMap2 = (StreamConfigurationMap) ((w2e) uj6Var.d.getValue()).d.b;
                        Size[] highSpeedVideoSizes = streamConfigurationMap2 != null ? streamConfigurationMap2.getHighSpeedVideoSizes() : null;
                        return highSpeedVideoSizes != null ? qd0.G0(highSpeedVideoSizes) : pu4.a;
                }
            }
        });
        final int i4 = 3;
        this.e = new ace(new x16(this) { // from class: tj6
            public final /* synthetic */ uj6 b;

            {
                this.b = this;
            }

            @Override // defpackage.x16
            public final Object invoke() {
                int i5 = i4;
                uj6 uj6Var = this.b;
                switch (i5) {
                    case 0:
                        yg1 yg1Var2 = uj6Var.a;
                        CameraCharacteristics.Key key = CameraCharacteristics.REQUEST_AVAILABLE_CAPABILITIES;
                        key.getClass();
                        int[] iArr = (int[]) ((nc1) yg1Var2).c(key);
                        boolean z = false;
                        if (iArr != null) {
                            for (int i6 : iArr) {
                                if (i6 == 9) {
                                    z = true;
                                }
                            }
                        }
                        return Boolean.valueOf(z);
                    case 1:
                        List list = (List) uj6Var.e.getValue();
                        if (list.isEmpty()) {
                            list = null;
                        }
                        if (list == null) {
                            return null;
                        }
                        Iterator it = list.iterator();
                        if (!it.hasNext()) {
                            s8f.c();
                            return null;
                        }
                        Object next = it.next();
                        if (it.hasNext()) {
                            int iA = jld.a((Size) next);
                            do {
                                Object next2 = it.next();
                                int iA2 = jld.a((Size) next2);
                                if (iA < iA2) {
                                    next = next2;
                                    iA = iA2;
                                }
                            } while (it.hasNext());
                        }
                        return (Size) next;
                    case 2:
                        yg1 yg1Var3 = uj6Var.a;
                        CameraCharacteristics.Key key2 = CameraCharacteristics.SCALER_STREAM_CONFIGURATION_MAP;
                        key2.getClass();
                        StreamConfigurationMap streamConfigurationMap = (StreamConfigurationMap) ((nc1) yg1Var3).c(key2);
                        if (streamConfigurationMap != null) {
                            return new w2e(streamConfigurationMap, new ut9(yg1Var3));
                        }
                        qc0.j("Cannot retrieve SCALER_STREAM_CONFIGURATION_MAP");
                        return null;
                    default:
                        StreamConfigurationMap streamConfigurationMap2 = (StreamConfigurationMap) ((w2e) uj6Var.d.getValue()).d.b;
                        Size[] highSpeedVideoSizes = streamConfigurationMap2 != null ? streamConfigurationMap2.getHighSpeedVideoSizes() : null;
                        return highSpeedVideoSizes != null ? qd0.G0(highSpeedVideoSizes) : pu4.a;
                }
            }
        });
    }

    public static List a(List list) {
        if (list.isEmpty()) {
            return pu4.a;
        }
        ArrayList arrayListL1 = s72.l1((Collection) s72.v0(list));
        Iterator it = s72.r0(list, 1).iterator();
        while (it.hasNext()) {
            arrayListL1.retainAll((List) it.next());
        }
        return arrayListL1;
    }

    public final Range[] b(List list) {
        int size = list.size();
        if (1 <= size && size < 3 && s72.j1(s72.n1(list)).size() == 1) {
            List listC = c((Size) list.get(0));
            if (listC.isEmpty()) {
                listC = null;
            }
            if (listC != null) {
                if (list.size() == 2) {
                    ArrayList arrayList = new ArrayList();
                    for (Object obj : listC) {
                        Range range = (Range) obj;
                        if (pa7.t(range.getLower(), range.getUpper())) {
                            arrayList.add(obj);
                        }
                    }
                    listC = arrayList;
                }
                return (Range[]) listC.toArray(new Range[0]);
            }
        }
        return null;
    }

    public final List c(Size size) {
        Object dzbVar;
        try {
            w2e w2eVar = (w2e) this.d.getValue();
            w2eVar.getClass();
            size.getClass();
            StreamConfigurationMap streamConfigurationMap = (StreamConfigurationMap) w2eVar.d.b;
            dzbVar = streamConfigurationMap != null ? streamConfigurationMap.getHighSpeedVideoFpsRangesFor(size) : null;
        } catch (Throwable th) {
            dzbVar = new dzb(th);
        }
        Range[] rangeArr = (Range[]) (dzbVar instanceof dzb ? null : dzbVar);
        return rangeArr != null ? s72.j1(qd0.k0(rangeArr)) : pu4.a;
    }
}
