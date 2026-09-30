package defpackage;

import android.graphics.Bitmap;
import android.graphics.drawable.Drawable;
import java.nio.ByteBuffer;

/* JADX INFO: compiled from: r8-map-id-c0f90335ad52c1b57db77aaf4b1db5c7c9c2627f2e01f059a43261b6162c0147 */
/* JADX INFO: loaded from: classes.dex */
public final class xe0 implements oc5 {
    public final /* synthetic */ int a;

    public /* synthetic */ xe0(int i) {
        this.a = i;
    }

    @Override // defpackage.oc5
    public final pc5 a(Object obj, as9 as9Var, mib mibVar) {
        int i = 0;
        int i2 = 1;
        int i3 = 2;
        switch (this.a) {
            case 0:
                qhf qhfVar = (qhf) obj;
                Bitmap.Config[] configArr = erf.a;
                if (pa7.t(qhfVar.c, "file") && pa7.t(s72.x0(afc.f(qhfVar)), "android_asset")) {
                    return new ye0(qhfVar, as9Var, i);
                }
                return null;
            case 1:
                return new fz0((Bitmap) obj);
            case 2:
                return new g61((byte[]) obj, as9Var, i);
            case 3:
                return new g61((ByteBuffer) obj, as9Var, i2);
            case 4:
                qhf qhfVar2 = (qhf) obj;
                if (pa7.t(qhfVar2.c, "content")) {
                    return new fn2(qhfVar2, as9Var);
                }
                return null;
            case 5:
                qhf qhfVar3 = (qhf) obj;
                if (pa7.t(qhfVar3.c, "data")) {
                    return new ye0(qhfVar3, as9Var, i2);
                }
                return null;
            case 6:
                return new g61((Drawable) obj, as9Var, i3);
            case 7:
                qhf qhfVar4 = (qhf) obj;
                String str = qhfVar4.c;
                if ((str != null && !str.equals("file")) || qhfVar4.e == null) {
                    return null;
                }
                Bitmap.Config[] configArr2 = erf.a;
                if (pa7.t(qhfVar4.c, "file") && pa7.t(s72.x0(afc.f(qhfVar4)), "android_asset")) {
                    return null;
                }
                return new ye0(qhfVar4, as9Var, i3);
            case 8:
                qhf qhfVar5 = (qhf) obj;
                if (pa7.t(qhfVar5.c, "jar:file")) {
                    return new ye0(qhfVar5, as9Var, 3);
                }
                return null;
            default:
                qhf qhfVar6 = (qhf) obj;
                if (pa7.t(qhfVar6.c, "android.resource")) {
                    return new ye0(qhfVar6, as9Var, 4);
                }
                return null;
        }
    }
}
