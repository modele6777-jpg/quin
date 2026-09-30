package defpackage;

import android.hardware.camera2.CameraCaptureSession;
import android.util.ArrayMap;
import java.util.ArrayList;
import java.util.Collections;
import java.util.HashSet;
import java.util.Iterator;
import java.util.List;
import java.util.Map;

/* JADX INFO: compiled from: r8-map-id-c0f90335ad52c1b57db77aaf4b1db5c7c9c2627f2e01f059a43261b6162c0147 */
/* JADX INFO: loaded from: classes.dex */
public class ik1 {
    public static final ik1 a = new ik1();

    public void a(iv6 iv6Var, r1f r1fVar) {
        int i;
        im1 im1Var = (im1) iv6Var.a(xjf.f0, null);
        bs9 bs9Var = bs9.c;
        bs9Var.getClass();
        no0 no0Var = im1.f;
        HashSet hashSet = new HashSet();
        k79 k79VarJ = k79.j();
        ArrayList arrayList = new ArrayList();
        m89 m89VarA = m89.a();
        ArrayList arrayList2 = new ArrayList(hashSet);
        bs9 bs9VarD = bs9.d(k79VarJ);
        ArrayList arrayList3 = new ArrayList(arrayList);
        wde wdeVar = wde.b;
        ArrayMap arrayMap = new ArrayMap();
        ArrayMap arrayMap2 = m89VarA.a;
        for (String str : arrayMap2.keySet()) {
            arrayMap.put(str, arrayMap2.get(str));
        }
        new im1(arrayList2, bs9VarD, -1, arrayList3, new wde(arrayMap));
        if (im1Var != null) {
            int i2 = im1Var.c;
            r1fVar.a(im1Var.d);
            bs9 bs9Var2 = im1Var.b;
            ((m89) r1fVar.e).a.putAll((Map) im1Var.e.a);
            List listUnmodifiableList = Collections.unmodifiableList(im1Var.a);
            listUnmodifiableList.getClass();
            Iterator it = listUnmodifiableList.iterator();
            while (it.hasNext()) {
                ((HashSet) r1fVar.b).add((lu3) it.next());
            }
            i = i2;
            bs9Var = bs9Var2;
        } else {
            i = -1;
        }
        r1fVar.c = k79.m(bs9Var);
        Object objA = iv6Var.a(od1.d, Integer.valueOf(i));
        objA.getClass();
        r1fVar.a = ((Number) objA).intValue();
        CameraCaptureSession.CaptureCallback captureCallback = (CameraCaptureSession.CaptureCallback) iv6Var.a(od1.g, null);
        if (captureCallback != null) {
            r1fVar.d(new gk1(captureCallback));
        }
        mjg mjgVar = new mjg(7);
        iv6Var.g(new bo1(0, mjgVar, iv6Var));
        r1fVar.e(new ssg(7, bs9.d((k79) mjgVar.a)));
    }
}
