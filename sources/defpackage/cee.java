package defpackage;

import android.graphics.Rect;
import android.graphics.RectF;
import android.util.Log;
import android.util.Size;
import androidx.camera.core.internal.compat.quirk.ImageCaptureRotationOptionQuirk;
import java.util.ArrayDeque;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.HashSet;
import java.util.Iterator;
import java.util.List;
import java.util.Objects;

/* JADX INFO: compiled from: r8-map-id-c0f90335ad52c1b57db77aaf4b1db5c7c9c2627f2e01f059a43261b6162c0147 */
/* JADX INFO: loaded from: classes.dex */
public final class cee implements fs5 {
    public final kb6 b;
    public szc c;
    public utb d;
    public final ArrayList e;
    public final ArrayDeque a = new ArrayDeque();
    public boolean f = false;

    public cee(kb6 kb6Var) {
        p8c.m();
        this.b = kb6Var;
        this.e = new ArrayList();
    }

    @Override // defpackage.fs5
    public final void a(gs5 gs5Var) {
        ((ah6) ok8.w()).execute(new bee(this, 1));
    }

    public final void b() {
        int i;
        p8c.m();
        jv6 jv6Var = new jv6(3, "Camera is closed.", null);
        ArrayDeque arrayDeque = this.a;
        Iterator it = arrayDeque.iterator();
        while (true) {
            i = 8;
            if (!it.hasNext()) {
                break;
            }
            oq0 oq0Var = (oq0) it.next();
            oq0Var.c.execute(new ni(i, oq0Var, jv6Var));
        }
        arrayDeque.clear();
        for (utb utbVar : new ArrayList(this.e)) {
            utbVar.getClass();
            p8c.m();
            if (!utbVar.d.b.isDone()) {
                p8c.m();
                utbVar.g = true;
                tv1 tv1Var = utbVar.i;
                Objects.requireNonNull(tv1Var);
                tv1Var.cancel(true);
                utbVar.e.d(jv6Var);
                utbVar.f.b(null);
                p8c.m();
                oq0 oq0Var2 = utbVar.a;
                oq0Var2.c.execute(new ni(i, oq0Var2, jv6Var));
            }
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    public final void c() {
        pa1 pa1Var;
        he1 he1Var;
        vx6 vx6Var;
        p8c.m();
        Log.d("TakePictureManagerImpl", "Issue the next TakePictureRequest.");
        if (this.d != null) {
            Log.d("TakePictureManagerImpl", "There is already a request in-flight.");
            return;
        }
        if (this.f) {
            Log.d("TakePictureManagerImpl", "The class is paused.");
            return;
        }
        szc szcVar = this.c;
        szcVar.getClass();
        p8c.m();
        if (((hbc) szcVar.d).Y() == 0) {
            Log.d("TakePictureManagerImpl", "Too many acquire images. Close image to be able to process next.");
            return;
        }
        oq0 oq0Var = (oq0) this.a.poll();
        if (oq0Var == null) {
            Log.d("TakePictureManagerImpl", "No new request.");
            return;
        }
        utb utbVar = new utb(oq0Var, this);
        int i = 0;
        boolean z = true;
        ok8.o(null, !(this.d != null));
        this.d = utbVar;
        p8c.m();
        utbVar.c.b.b(new bee(this, i), g94.a());
        this.e.add(utbVar);
        p8c.m();
        utbVar.d.b.b(new xu8(17, this, utbVar), g94.a());
        szc szcVar2 = this.c;
        p8c.m();
        pa1 pa1Var2 = utbVar.c;
        szcVar2.getClass();
        p8c.m();
        hm1 hm1Var = (hm1) ((iv6) szcVar2.b).a(iv6.d, new hm1(Arrays.asList(new so1())));
        Objects.requireNonNull(hm1Var);
        int i2 = szc.w;
        szc.w = i2 + 1;
        ko0 ko0Var = (ko0) szcVar2.e;
        ArrayList arrayList = new ArrayList();
        String strValueOf = String.valueOf(hm1Var.hashCode());
        List<so1> list = hm1Var.a;
        Objects.requireNonNull(list);
        for (so1 so1Var : list) {
            r1f r1fVar = new r1f(2);
            im1 im1Var = (im1) szcVar2.c;
            int i3 = i;
            r1fVar.a = im1Var.c;
            r1fVar.e(im1Var.b);
            r1fVar.a(oq0Var.k);
            vx6 vx6Var2 = ko0Var.c;
            int i4 = ko0Var.g;
            ArrayList arrayList2 = ko0Var.h;
            Objects.requireNonNull(vx6Var2);
            szc szcVar3 = szcVar2;
            ((HashSet) r1fVar.b).add(vx6Var2);
            if (arrayList2.size() > 1 && (vx6Var = ko0Var.d) != null) {
                ((HashSet) r1fVar.b).add(vx6Var);
            }
            vx6 vx6Var3 = ko0Var.e;
            if ((vx6Var3 != null ? 1 : i3) != 0) {
                Objects.requireNonNull(vx6Var3);
                ((HashSet) r1fVar.b).add(vx6Var3);
            }
            if (i7h.z(i4) || i4 == 32) {
                if (((ImageCaptureRotationOptionQuirk) q74.a.b(ImageCaptureRotationOptionQuirk.class)) != null) {
                    no0 no0Var = im1.f;
                } else {
                    ((k79) r1fVar.c).p(im1.f, Integer.valueOf(oq0Var.g));
                }
                no0 no0Var2 = im1.g;
                Rect rect = oq0Var.e;
                Size size = ko0Var.f;
                RectF rectF = s2f.a;
                if (rect.left == 0 && rect.top == 0) {
                    pa1Var = pa1Var2;
                    if (rect.width() == size.getWidth()) {
                        rect.height();
                        size.getHeight();
                    }
                } else {
                    pa1Var = pa1Var2;
                }
                ((k79) r1fVar.c).p(no0Var2, Integer.valueOf(oq0Var.h));
            } else {
                pa1Var = pa1Var2;
            }
            r1fVar.e(so1Var.a.b);
            ((m89) r1fVar.e).a.put(strValueOf, Integer.valueOf(i3));
            ((m89) r1fVar.e).a.put("CAPTURE_CONFIG_ID_KEY", Integer.valueOf(i2));
            r1fVar.d(ko0Var.a);
            if (arrayList2.size() > 1 && (he1Var = ko0Var.b) != null) {
                r1fVar.d(he1Var);
            }
            arrayList.add(r1fVar.j());
            z = true;
            i = i3;
            szcVar2 = szcVar3;
            hm1Var = hm1Var;
            pa1Var2 = pa1Var;
        }
        boolean z2 = i;
        boolean z3 = z;
        k47 k47Var = new k47(18, arrayList, utbVar);
        uva uvaVar = new uva(hm1Var, oq0Var, utbVar, pa1Var2, i2);
        szc szcVar4 = this.c;
        szcVar4.getClass();
        p8c.m();
        ((ko0) szcVar4.e).j.accept(uvaVar);
        p8c.m();
        hv6 hv6Var = (hv6) this.b.b;
        synchronized (hv6Var.s) {
            try {
                if (hv6Var.s.get() == null) {
                    hv6Var.s.set(Integer.valueOf(hv6Var.G()));
                }
            } catch (Throwable th) {
                throw th;
            }
        }
        hv6 hv6Var2 = (hv6) this.b.b;
        p8c.m();
        tv1 tv1VarD0 = bm8.d0(hv6Var2.e().f(arrayList, hv6Var2.r, hv6Var2.t), new vd9(21, new yg5(19)), g94.a());
        tv1VarD0.b(new w36(z2 ? 1 : 0, tv1VarD0, new vea(this, k47Var, z2, 14)), ok8.w());
        p8c.m();
        if (utbVar.i != null) {
            z3 = z2 ? 1 : 0;
        }
        ok8.o("CaptureRequestFuture can only be set once.", z3);
        utbVar.i = tv1VarD0;
    }
}
