package defpackage;

import android.hardware.camera2.CameraCharacteristics;
import android.util.Rational;
import android.util.Size;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.LinkedHashSet;
import java.util.List;

/* JADX INFO: compiled from: r8-map-id-c0f90335ad52c1b57db77aaf4b1db5c7c9c2627f2e01f059a43261b6162c0147 */
/* JADX INFO: loaded from: classes.dex */
public final class yn5 implements sif, dkf {
    public final gh1 a;
    public final n0e b;
    public ajf c;
    public za2 d;

    public yn5(gh1 gh1Var, gv8 gv8Var, n0e n0eVar, lkf lkfVar, ydg ydgVar) {
        Object next;
        gh1Var.getClass();
        n0eVar.getClass();
        lkfVar.getClass();
        this.a = gh1Var;
        this.b = n0eVar;
        yg1 yg1Var = gh1Var.b;
        CameraCharacteristics.Key key = CameraCharacteristics.CONTROL_MAX_REGIONS_AF;
        key.getClass();
        Object obj = 0;
        nc1 nc1Var = (nc1) yg1Var;
        nc1Var.getClass();
        Object objC = nc1Var.c(key);
        CameraCharacteristics.Key key2 = CameraCharacteristics.CONTROL_MAX_REGIONS_AE;
        key2.getClass();
        nc1Var.getClass();
        Object objC2 = nc1Var.c(key2);
        CameraCharacteristics.Key key3 = CameraCharacteristics.CONTROL_MAX_REGIONS_AWB;
        key3.getClass();
        nc1Var.getClass();
        Object objC3 = nc1Var.c(key3);
        yg1.o.getClass();
        xg1.a(yg1Var);
        CameraCharacteristics.Key key4 = CameraCharacteristics.CONTROL_AE_AVAILABLE_MODES;
        key4.getClass();
        int[] iArr = (int[]) ((nc1) yg1Var).c(key4);
        if (iArr != null) {
            ArrayList arrayList = new ArrayList(iArr.length);
            for (int i : iArr) {
                List list = th.b;
                arrayList.add(x57.N(i));
            }
        }
        yg1 yg1Var2 = this.a.b;
        CameraCharacteristics.Key key5 = CameraCharacteristics.CONTROL_AF_AVAILABLE_MODES;
        key5.getClass();
        int[] iArr2 = (int[]) ((nc1) yg1Var2).c(key5);
        if (iArr2 != null) {
            ArrayList arrayList2 = new ArrayList(iArr2.length);
            for (int i2 : iArr2) {
                Iterator it = uh.b.iterator();
                do {
                    if (!it.hasNext()) {
                        next = null;
                        break;
                    }
                    next = it.next();
                } while (((uh) next).a != i2);
                arrayList2.add((uh) next);
            }
        }
    }

    @Override // defpackage.dkf
    public final void a(LinkedHashSet linkedHashSet) {
        Size sizeC;
        Iterator it = linkedHashSet.iterator();
        while (it.hasNext()) {
            oif oifVar = (oif) it.next();
            if ((oifVar instanceof wta) && (sizeC = ((wta) oifVar).c()) != null) {
                new Rational(sizeC.getWidth(), sizeC.getHeight());
            }
        }
    }

    @Override // defpackage.sif
    public final void b(ajf ajfVar) {
        this.c = ajfVar;
    }

    @Override // defpackage.sif
    public final void reset() {
        za2 za2Var = new za2();
        ajf ajfVar = this.c;
        if (ajfVar == null) {
            za2Var.i0(new ye1("Camera is not active."));
            return;
        }
        za2 za2Var2 = this.d;
        if (za2Var2 != null) {
            za2Var2.i0(new ye1("Cancelled by another cancelFocusAndMetering()"));
        }
        this.d = za2Var;
        n0e n0eVar = this.b;
        synchronized (n0eVar.d) {
        }
        n0eVar.f();
        lmg.o0(ajfVar.k(), za2Var);
    }
}
