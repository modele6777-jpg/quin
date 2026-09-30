package defpackage;

import android.hardware.camera2.CaptureRequest;
import android.os.Build;
import android.util.Range;
import java.lang.ref.SoftReference;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.LinkedHashMap;
import java.util.concurrent.ConcurrentHashMap;

/* JADX INFO: compiled from: r8-map-id-c0f90335ad52c1b57db77aaf4b1db5c7c9c2627f2e01f059a43261b6162c0147 */
/* JADX INFO: loaded from: classes.dex */
public final class su implements ydg, ezc, pz9 {
    public final Object a;
    public final Object b;

    public su(a26 a26Var) {
        this.a = a26Var;
        this.b = new s22();
    }

    @Override // defpackage.ydg
    public float b() {
        Object upper = ((Range) this.b).getUpper();
        upper.getClass();
        return ((Number) upper).floatValue();
    }

    @Override // defpackage.ydg
    public float d() {
        Object lower = ((Range) this.b).getLower();
        lower.getClass();
        return ((Number) lower).floatValue();
    }

    @Override // defpackage.ezc
    public xn7 h(em7 em7Var) {
        Object obj = ((s22) this.b).get(af1.R(em7Var));
        obj.getClass();
        d89 d89Var = (d89) obj;
        Object i81Var = d89Var.a.get();
        if (i81Var == null) {
            synchronized (d89Var) {
                i81Var = d89Var.a.get();
                if (i81Var == null) {
                    i81Var = new i81((xn7) ((a26) this.a).d(em7Var));
                    d89Var.a = new SoftReference(i81Var);
                }
            }
        }
        return ((i81) i81Var).a;
    }

    @Override // defpackage.pz9
    public Object r(em7 em7Var, ArrayList arrayList) {
        Object dzbVar;
        Object obj = ((s22) this.b).get(af1.R(em7Var));
        obj.getClass();
        d89 d89Var = (d89) obj;
        Object oz9Var = d89Var.a.get();
        if (oz9Var == null) {
            synchronized (d89Var) {
                oz9Var = d89Var.a.get();
                if (oz9Var == null) {
                    oz9Var = new oz9();
                    d89Var.a = new SoftReference(oz9Var);
                }
            }
        }
        oz9 oz9Var2 = (oz9) oz9Var;
        ArrayList arrayList2 = new ArrayList(t72.u(arrayList, 10));
        Iterator it = arrayList.iterator();
        while (it.hasNext()) {
            arrayList2.add(new go7((yn7) it.next()));
        }
        ConcurrentHashMap concurrentHashMap = oz9Var2.a;
        Object obj2 = concurrentHashMap.get(arrayList2);
        if (obj2 == null) {
            try {
                dzbVar = (xn7) ((l26) this.a).z(em7Var, arrayList);
            } catch (Throwable th) {
                dzbVar = new dzb(th);
            }
            ezb ezbVar = new ezb(dzbVar);
            Object objPutIfAbsent = concurrentHashMap.putIfAbsent(arrayList2, ezbVar);
            obj2 = objPutIfAbsent == null ? ezbVar : objPutIfAbsent;
        }
        return ((ezb) obj2).b();
    }

    @Override // defpackage.ydg
    public nu3 u(ajf ajfVar) {
        ajfVar.getClass();
        CaptureRequest.Key key = CaptureRequest.CONTROL_ZOOM_RATIO;
        key.getClass();
        ArrayList arrayListK = t72.K(key);
        if (Build.VERSION.SDK_INT >= 34) {
            CaptureRequest.Key key2 = CaptureRequest.CONTROL_SETTINGS_OVERRIDE;
            key2.getClass();
            arrayListK.add(key2);
        }
        return ajfVar.f(arrayListK, zif.b);
    }

    @Override // defpackage.ydg
    public nu3 v(ajf ajfVar) {
        ajfVar.getClass();
        float fD = d();
        if (1.0f > b() || fD > 1.0f) {
            qc0.j("Failed requirement.");
            return null;
        }
        LinkedHashMap linkedHashMapI = bm8.I(new iy9(CaptureRequest.CONTROL_ZOOM_RATIO, Float.valueOf(1.0f)));
        int i = Build.VERSION.SDK_INT;
        if (i >= 34) {
            xg1 xg1Var = yg1.o;
            yg1 yg1Var = ((gh1) this.a).b;
            xg1Var.getClass();
            yg1Var.getClass();
            if (i >= 34 && hgc.D(yg1Var)) {
                hgc.W(linkedHashMapI);
            }
        }
        return ajf.b(ajfVar, linkedHashMapI);
    }

    public su(l26 l26Var) {
        this.a = l26Var;
        this.b = new s22();
    }

    public su(gh1 gh1Var, Range range) {
        this.a = gh1Var;
        this.b = range;
    }
}
