package defpackage;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Iterator;
import java.util.List;

/* JADX INFO: compiled from: r8-map-id-c0f90335ad52c1b57db77aaf4b1db5c7c9c2627f2e01f059a43261b6162c0147 */
/* JADX INFO: loaded from: classes3.dex */
public final class j27 {
    public boolean a;
    public int b;
    public Object c;
    public Object d;

    public j27(cvd cvdVar, boolean z, cx1 cx1Var, int i) {
        this.d = cvdVar;
        this.a = z;
        this.c = cx1Var;
        this.b = i;
    }

    public static j27 b() {
        j27 j27Var = new j27();
        j27Var.a = true;
        j27Var.b = 0;
        return j27Var;
    }

    public static j27 c(String str) {
        pa7.z("The separator may not be the empty string.", str.length() != 0);
        if (str.length() == 1) {
            return new j27(new vrb(4, new dx1(str.charAt(0))));
        }
        return new j27(new ig4(str, 1));
    }

    public j27 a() {
        oa7.u("execute parameter required", ((ypb) this.c) != null);
        za5[] za5VarArr = (za5[]) this.d;
        boolean z = this.a;
        int i = this.b;
        j27 j27Var = new j27();
        j27Var.d = this;
        j27Var.c = za5VarArr;
        boolean z2 = false;
        if (za5VarArr != null && z) {
            z2 = true;
        }
        j27Var.a = z2;
        j27Var.b = i;
        return j27Var;
    }

    public List d(CharSequence charSequence) {
        charSequence.getClass();
        Iterator itB = ((cvd) this.d).b(this, charSequence);
        ArrayList arrayList = new ArrayList();
        while (true) {
            avd avdVar = (avd) itB;
            if (!avdVar.hasNext()) {
                return Collections.unmodifiableList(arrayList);
            }
            arrayList.add((String) avdVar.next());
        }
    }

    public j27(cvd cvdVar) {
        this(cvdVar, false, ex1.b, Integer.MAX_VALUE);
    }
}
