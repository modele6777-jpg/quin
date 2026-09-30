package defpackage;

import java.util.ArrayList;
import java.util.EnumSet;
import java.util.Iterator;
import java.util.List;
import java.util.Map;

/* JADX INFO: compiled from: r8-map-id-c0f90335ad52c1b57db77aaf4b1db5c7c9c2627f2e01f059a43261b6162c0147 */
/* JADX INFO: loaded from: classes3.dex */
public abstract class ud7 {
    public static final Map a = bm8.H(new iy9("PACKAGE", EnumSet.noneOf(st7.class)), new iy9("TYPE", EnumSet.of(st7.b, st7.Y)), new iy9("ANNOTATION_TYPE", EnumSet.of(st7.c)), new iy9("TYPE_PARAMETER", EnumSet.of(st7.d)), new iy9("FIELD", EnumSet.of(st7.f)), new iy9("LOCAL_VARIABLE", EnumSet.of(st7.g)), new iy9("PARAMETER", EnumSet.of(st7.v)), new iy9("CONSTRUCTOR", EnumSet.of(st7.w)), new iy9("METHOD", EnumSet.of(st7.x, st7.y, st7.z)), new iy9("TYPE_USE", EnumSet.of(st7.X)));
    public static final Map b = bm8.H(new iy9("RUNTIME", rt7.a), new iy9("CLASS", rt7.b), new iy9("SOURCE", rt7.c));

    public static pd0 a(List list) {
        ArrayList arrayList = new ArrayList();
        for (Object obj : list) {
            if (obj instanceof knb) {
                arrayList.add(obj);
            }
        }
        ArrayList<st7> arrayList2 = new ArrayList();
        Iterator it = arrayList.iterator();
        while (it.hasNext()) {
            Iterable iterable = (EnumSet) a.get(t99.e(((knb) it.next()).b.name()).b());
            if (iterable == null) {
                iterable = xu4.a;
            }
            x72.g0(arrayList2, iterable);
        }
        ArrayList arrayList3 = new ArrayList(t72.u(arrayList2, 10));
        for (st7 st7Var : arrayList2) {
            dx5 dx5Var = syd.u;
            dx5Var.getClass();
            arrayList3.add(new rx4(new j22(dx5Var.b(), dx5Var.a.g()), t99.e(st7Var.name())));
        }
        return new pd0(arrayList3, z03.T0);
    }
}
