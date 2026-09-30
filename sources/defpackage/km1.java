package defpackage;

import android.hardware.camera2.CaptureRequest;
import android.media.Image;
import java.util.ArrayList;
import java.util.Collections;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.Map;
import java.util.TreeMap;
import java.util.concurrent.atomic.AtomicReference;

/* JADX INFO: compiled from: r8-map-id-c0f90335ad52c1b57db77aaf4b1db5c7c9c2627f2e01f059a43261b6162c0147 */
/* JADX INFO: loaded from: classes.dex */
public final class km1 {
    public final ckf a;
    public final ceg b;
    public final lkf c;
    public final xle d;
    public final boolean e;

    public km1(gh1 gh1Var, ckf ckfVar, ceg cegVar, lkf lkfVar, xle xleVar) {
        gh1Var.getClass();
        ckfVar.getClass();
        cegVar.getClass();
        lkfVar.getClass();
        this.a = ckfVar;
        this.b = cegVar;
        this.c = lkfVar;
        this.d = xleVar;
        xg1 xg1Var = yg1.o;
        yg1 yg1Var = gh1Var.b;
        xg1Var.getClass();
        this.e = xg1.c(yg1Var);
    }

    /* JADX WARN: Code duplicated, block: B:50:0x013a  */
    /* JADX WARN: Multi-variable type inference failed */
    public final ctb a(im1 im1Var, int i, qh2 qh2Var, List list) {
        q47 q47Var;
        iw6 iw6VarG;
        jm1 jm1Var;
        im1Var.getClass();
        int i2 = im1Var.c;
        qh2Var.getClass();
        List<lu3> listUnmodifiableList = Collections.unmodifiableList(im1Var.a);
        listUnmodifiableList.getClass();
        Object q47Var2 = null;
        if (listUnmodifiableList.isEmpty()) {
            ho7.w(im1Var, "Attempted to issue a capture without surfaces using ");
            return null;
        }
        ArrayList arrayList = new ArrayList(t72.u(listUnmodifiableList, 10));
        for (lu3 lu3Var : listUnmodifiableList) {
            Object obj = ((Map) this.a.f.getValue()).get(lu3Var);
            if (obj == null) {
                ho7.w(lu3Var, "Attempted to issue a capture with an unrecognized surface: ");
                return null;
            }
            arrayList.add((e3e) obj);
        }
        ge1 ge1Var = new ge1();
        List<he1> list2 = im1Var.d;
        list2.getClass();
        for (he1 he1Var : list2) {
            he1Var.getClass();
            ge1Var.a(he1Var, this.c.e);
        }
        bs9 bs9Var = im1Var.b;
        TreeMap treeMap = bs9Var.a;
        vd9 vd9Var = new vd9(8);
        k79 k79Var = (k79) vd9Var.b;
        vd9Var.y(qh2Var);
        vd9Var.y(bs9Var);
        no0 no0Var = im1.f;
        if (treeMap.containsKey(no0Var)) {
            CaptureRequest.Key key = CaptureRequest.JPEG_ORIENTATION;
            key.getClass();
            Object objC = bs9Var.c(no0Var);
            objC.getClass();
            k79Var.p(af1.D(key), objC);
        }
        no0 no0Var2 = im1.g;
        if (treeMap.containsKey(no0Var2)) {
            CaptureRequest.Key key2 = CaptureRequest.JPEG_QUALITY;
            key2.getClass();
            Object objC2 = bs9Var.c(no0Var2);
            objC2.getClass();
            k79Var.p(af1.D(key2), Byte.valueOf((byte) ((Number) objC2).intValue()));
        }
        if (i2 == 5) {
            ceg cegVar = this.b;
            if (cegVar.c() || cegVar.d() || (iw6VarG = cegVar.g()) == null) {
                q47Var = 0;
            } else {
                vv6 vv6VarU0 = iw6VarG.u0();
                oe1 oe1Var = vv6VarU0 instanceof pe1 ? ((pe1) vv6VarU0).a : null;
                if (oe1Var == null) {
                    jm1Var = null;
                } else {
                    if (!(oe1Var instanceof co1)) {
                        ho7.w(oe1Var.getClass(), "Unexpected capture result type: ");
                        return null;
                    }
                    Image imageR = iw6VarG.r();
                    if (imageR == null) {
                        qc0.p("Required value was null.");
                        return null;
                    }
                    js jsVar = new js(imageR);
                    Object objH0 = ((co1) oe1Var).H0(job.a.b(uy5.class));
                    if (objH0 == null) {
                        qc0.p("Required value was null.");
                        return null;
                    }
                    q47Var2 = new q47(jsVar, (uy5) objH0);
                    jm1Var = new jm1(new AtomicReference(iw6VarG));
                }
                q47Var = q47Var2;
                q47Var2 = jm1Var;
            }
        } else {
            q47Var = 0;
        }
        if (q47Var == 0) {
            int i3 = (i != 3 || this.e) ? (i2 == -1 || i2 == 5) ? 2 : -1 : 4;
            if (i3 != -1) {
                i2 = i3;
            }
        }
        LinkedHashMap linkedHashMapL = bm8.L(this.d.a(new ttb(i2)), af1.d0(vd9Var.g()));
        c78 c78VarW = t72.w();
        c78VarW.add(ge1Var);
        if (q47Var2 != null) {
            c78VarW.add(q47Var2);
        }
        c78VarW.addAll(list);
        return new ctb(arrayList, linkedHashMapL, bm8.G(new iy9(yde.a, im1Var.e)), c78VarW.n(), new ttb(i2), q47Var);
    }
}
