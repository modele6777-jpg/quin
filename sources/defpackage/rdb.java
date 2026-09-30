package defpackage;

import java.security.AccessControlException;
import java.util.HashMap;

/* JADX INFO: compiled from: r8-map-id-c0f90335ad52c1b57db77aaf4b1db5c7c9c2627f2e01f059a43261b6162c0147 */
/* JADX INFO: loaded from: classes.dex */
public final class rdb implements ks7 {
    public static final boolean v;
    public static final HashMap w;
    public int[] a;
    public String b;
    public int c;
    public String[] d;
    public String[] e;
    public String[] f;
    public yr7 g;

    static {
        try {
            v = "true".equals(System.getProperty("kotlin.ignore.old.metadata"));
        } catch (AccessControlException unused) {
            v = false;
        }
        HashMap map = new HashMap();
        w = map;
        map.put(mh3.b0(new dx5("kotlin.jvm.internal.KotlinClass")), yr7.CLASS);
        map.put(mh3.b0(new dx5("kotlin.jvm.internal.KotlinFileFacade")), yr7.FILE_FACADE);
        map.put(mh3.b0(new dx5("kotlin.jvm.internal.KotlinMultifileClass")), yr7.MULTIFILE_CLASS);
        map.put(mh3.b0(new dx5("kotlin.jvm.internal.KotlinMultifileClassPart")), yr7.MULTIFILE_CLASS_PART);
        map.put(mh3.b0(new dx5("kotlin.jvm.internal.KotlinSyntheticClass")), yr7.SYNTHETIC_CLASS);
    }

    @Override // defpackage.ks7
    public final is7 u(j22 j22Var, rmb rmbVar) {
        yr7 yr7Var;
        if (j22Var.a().equals(pj7.a)) {
            return new kd9(25, this);
        }
        if (v || this.g != null || (yr7Var = (yr7) w.get(j22Var)) == null) {
            return null;
        }
        this.g = yr7Var;
        return new yea(this);
    }
}
