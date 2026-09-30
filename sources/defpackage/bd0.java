package defpackage;

import com.google.gson.JsonArray;
import java.lang.reflect.Array;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import java.util.stream.Collectors;

/* JADX INFO: compiled from: r8-map-id-c0f90335ad52c1b57db77aaf4b1db5c7c9c2627f2e01f059a43261b6162c0147 */
/* JADX INFO: loaded from: classes3.dex */
public final class bd0 implements ei7 {
    public static final bd0 c;
    public static final bd0 d;
    public static final bd0 e;
    public static final bd0 f;
    public final /* synthetic */ int a;
    public final boolean b;

    static {
        int i = 0;
        c = new bd0(true, i);
        d = new bd0(false, i);
        int i2 = 1;
        e = new bd0(true, i2);
        f = new bd0(false, i2);
    }

    public /* synthetic */ bd0(boolean z, int i) {
        this.a = i;
        this.b = z;
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r7v12, types: [java.util.ArrayList] */
    /* JADX WARN: Type inference failed for: r7v14, types: [java.util.List] */
    /* JADX WARN: Type inference failed for: r7v15, types: [java.util.ArrayList] */
    /* JADX WARN: Type inference failed for: r7v16, types: [java.util.List] */
    /* JADX WARN: Type inference failed for: r7v22, types: [java.util.List] */
    @Override // defpackage.ei7
    public final Object a(kb6 kb6Var, ai7 ai7Var, Object obj, String str) throws ci7 {
        ?? arrayList;
        int i = this.a;
        int i2 = 0;
        Object objM = null;
        boolean z = this.b;
        switch (i) {
            case 0:
                if (ai7Var.a.size() != 2) {
                    throw new ci7(c().concat(" expects exactly 2 arguments"), str);
                }
                Object objM2 = kb6Var.m(ai7Var.get(0), obj, str.concat("[0]"));
                if (objM2 == null) {
                    return z ? Boolean.FALSE : Boolean.TRUE;
                }
                if (!cd0.a(objM2)) {
                    throw new ci7("first argument to " + c() + " must be a valid array", str.concat("[0]"));
                }
                if (objM2 instanceof List) {
                    arrayList = (List) ((List) objM2).stream().map(new fj0(5)).collect(Collectors.toList());
                } else if (objM2.getClass().isArray()) {
                    arrayList = new ArrayList();
                    while (i2 < Array.getLength(objM2)) {
                        arrayList.add(i2, kb6.r(Array.get(objM2, i2)));
                        i2++;
                    }
                } else if (objM2 instanceof JsonArray) {
                    arrayList = (List) g21.L((JsonArray) objM2);
                } else {
                    if (!(objM2 instanceof Iterable)) {
                        qc0.j("ArrayLike only works with lists, iterables, arrays, or JsonArray");
                        return null;
                    }
                    arrayList = new ArrayList();
                    Iterator it = ((Iterable) objM2).iterator();
                    while (it.hasNext()) {
                        arrayList.add(kb6.r(it.next()));
                    }
                }
                Iterator it2 = arrayList.iterator();
                while (it2.hasNext()) {
                    if (gg7.y(kb6Var.m(ai7Var.get(1), it2.next(), str.concat("[1]")))) {
                        return Boolean.valueOf(z);
                    }
                }
                return Boolean.valueOf(!z);
            default:
                List list = ai7Var.a;
                if (list.size() < 1) {
                    throw new ci7(c().concat(" operator expects at least 1 argument"), str);
                }
                Iterator it3 = list.iterator();
                while (it3.hasNext()) {
                    int i3 = i2 + 1;
                    objM = kb6Var.m((fi7) it3.next(), obj, String.format("%s[%d]", str, Integer.valueOf(i2)));
                    if ((z && !gg7.y(objM)) || (!z && gg7.y(objM))) {
                        return objM;
                    }
                    i2 = i3;
                }
                return objM;
        }
    }

    @Override // defpackage.ei7
    public final String c() {
        switch (this.a) {
            case 0:
                return this.b ? "some" : "none";
            default:
                return this.b ? "and" : "or";
        }
    }
}
