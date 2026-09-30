package defpackage;

import android.hardware.camera2.CaptureRequest;
import android.hardware.camera2.params.MeteringRectangle;
import com.google.firebase.crashlytics.internal.metadata.UserMetadata;
import java.util.LinkedHashMap;
import java.util.List;

/* JADX INFO: compiled from: r8-map-id-c0f90335ad52c1b57db77aaf4b1db5c7c9c2627f2e01f059a43261b6162c0147 */
/* JADX INFO: loaded from: classes.dex */
public final class de6 {
    public final zh0 a = vpf.o(new k0e(null, null, null, null, null, null, null, null, null, null));

    /* JADX WARN: Code duplicated, block: B:64:0x0085  */
    /* JADX WARN: Code duplicated, block: B:73:0x009c  */
    /* JADX WARN: Code duplicated, block: B:80:0x00ad  */
    public static void b(de6 de6Var, th thVar, uh uhVar, vr0 vr0Var, yi5 yi5Var, List list, List list2, List list3, Boolean bool, Boolean bool2, Boolean bool3, int i) {
        List list4;
        List list5;
        List list6;
        th thVar2 = (i & 1) != 0 ? null : thVar;
        uh uhVar2 = (i & 2) != 0 ? null : uhVar;
        vr0 vr0Var2 = (i & 4) != 0 ? null : vr0Var;
        yi5 yi5Var2 = (i & 8) != 0 ? null : yi5Var;
        List list7 = (i & 16) != 0 ? null : list;
        List list8 = (i & 32) != 0 ? null : list2;
        List list9 = (i & 64) != 0 ? null : list3;
        Boolean bool4 = (i & UserMetadata.MAX_ROLLOUT_ASSIGNMENTS) != 0 ? null : bool;
        Boolean bool5 = (i & 256) != 0 ? null : bool2;
        Boolean bool6 = (i & 512) != 0 ? null : bool3;
        zh0 zh0Var = de6Var.a;
        while (true) {
            Object obj = zh0Var.a;
            k0e k0eVar = (k0e) obj;
            th thVar3 = thVar2 == null ? k0eVar.a : thVar2;
            uh uhVar3 = uhVar2 == null ? k0eVar.b : uhVar2;
            vr0 vr0Var3 = vr0Var2 == null ? k0eVar.c : vr0Var2;
            Boolean bool7 = bool6;
            yi5 yi5Var3 = yi5Var2 == null ? k0eVar.d : yi5Var2;
            if (list7 == null) {
                list4 = k0eVar.e;
            } else {
                list4 = list7.isEmpty() ? null : list7;
                if (list4 == null) {
                    list4 = k0eVar.e;
                }
            }
            if (list8 == null) {
                list5 = k0eVar.f;
            } else {
                list5 = list8.isEmpty() ? null : list8;
                if (list5 == null) {
                    list5 = k0eVar.f;
                }
            }
            if (list9 == null) {
                list6 = k0eVar.g;
            } else {
                list6 = list9.isEmpty() ? null : list9;
                if (list6 == null) {
                    list6 = k0eVar.g;
                }
            }
            Boolean bool8 = bool4 == null ? k0eVar.h : bool4;
            Boolean bool9 = bool5 == null ? k0eVar.i : bool5;
            Boolean bool10 = bool7 == null ? k0eVar.j : bool7;
            k0eVar.getClass();
            if (zh0Var.a(obj, new k0e(thVar3, uhVar3, vr0Var3, yi5Var3, list4, list5, list6, bool8, bool9, bool10))) {
                return;
            } else {
                bool6 = bool7;
            }
        }
    }

    public final LinkedHashMap a() {
        k0e k0eVar = (k0e) this.a.a;
        k0eVar.getClass();
        LinkedHashMap linkedHashMap = new LinkedHashMap();
        th thVar = k0eVar.a;
        if (thVar != null) {
            int i = thVar.a;
            CaptureRequest.Key key = CaptureRequest.CONTROL_AE_MODE;
            key.getClass();
            linkedHashMap.put(key, Integer.valueOf(i));
        }
        uh uhVar = k0eVar.b;
        if (uhVar != null) {
            int i2 = uhVar.a;
            CaptureRequest.Key key2 = CaptureRequest.CONTROL_AF_MODE;
            key2.getClass();
            linkedHashMap.put(key2, Integer.valueOf(i2));
        }
        vr0 vr0Var = k0eVar.c;
        if (vr0Var != null) {
            int i3 = vr0Var.a;
            CaptureRequest.Key key3 = CaptureRequest.CONTROL_AWB_MODE;
            key3.getClass();
            linkedHashMap.put(key3, Integer.valueOf(i3));
        }
        yi5 yi5Var = k0eVar.d;
        if (yi5Var != null) {
            int i4 = yi5Var.a;
            CaptureRequest.Key key4 = CaptureRequest.FLASH_MODE;
            key4.getClass();
            linkedHashMap.put(key4, Integer.valueOf(i4));
        }
        List list = k0eVar.e;
        if (list != null) {
            CaptureRequest.Key key5 = CaptureRequest.CONTROL_AE_REGIONS;
            key5.getClass();
            linkedHashMap.put(key5, list.toArray(new MeteringRectangle[0]));
        }
        List list2 = k0eVar.f;
        if (list2 != null) {
            CaptureRequest.Key key6 = CaptureRequest.CONTROL_AF_REGIONS;
            key6.getClass();
            linkedHashMap.put(key6, list2.toArray(new MeteringRectangle[0]));
        }
        List list3 = k0eVar.g;
        if (list3 != null) {
            CaptureRequest.Key key7 = CaptureRequest.CONTROL_AWB_REGIONS;
            key7.getClass();
            linkedHashMap.put(key7, list3.toArray(new MeteringRectangle[0]));
        }
        Boolean bool = k0eVar.h;
        if (bool != null) {
            CaptureRequest.Key key8 = CaptureRequest.CONTROL_AE_LOCK;
            key8.getClass();
            linkedHashMap.put(key8, bool);
        }
        Boolean bool2 = k0eVar.j;
        if (bool2 != null) {
            CaptureRequest.Key key9 = CaptureRequest.CONTROL_AWB_LOCK;
            key9.getClass();
            linkedHashMap.put(key9, bool2);
        }
        return linkedHashMap;
    }
}
