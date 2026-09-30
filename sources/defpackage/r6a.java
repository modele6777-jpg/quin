package defpackage;

import android.content.SharedPreferences;

/* JADX INFO: compiled from: r8-map-id-c0f90335ad52c1b57db77aaf4b1db5c7c9c2627f2e01f059a43261b6162c0147 */
/* JADX INFO: loaded from: classes.dex */
public final class r6a {
    public final kb6 a;
    public final gl b;
    public final x16 c;
    public final Object d;

    public r6a(kb6 kb6Var, fk8 fk8Var, gl glVar) {
        vy9 vy9Var = new vy9(17);
        this.a = kb6Var;
        this.b = glVar;
        this.c = vy9Var;
        this.d = new Object();
    }

    public final String a(r8a r8aVar, ei9 ei9Var) {
        String str;
        ei9Var.getClass();
        synchronized (this.d) {
            str = (String) this.c.invoke();
            str.getClass();
            SharedPreferences.Editor editorEdit = ((SharedPreferences) this.a.b).edit();
            String strName = r8aVar.name();
            String str2 = ei9Var.a;
            String str3 = ei9Var.b;
            Integer num = ei9Var.c;
            String strValueOf = num != null ? String.valueOf(num.intValue()) : null;
            if (strValueOf == null) {
                strValueOf = "";
            }
            if (!editorEdit.putString("pending", s72.D0(t72.I(str, strName, str2, str3, strValueOf), "\u001f", null, null, null, 62)).commit()) {
                str = null;
            }
        }
        return str;
    }

    public final t6a b(String str) {
        r8a r8aVar = r8a.SystemDialog;
        synchronized (this.d) {
            t6a t6aVarQ = this.a.q();
            if (t6aVarQ == null) {
                return null;
            }
            if (t6aVarQ.b == r8aVar && pa7.t(t6aVarQ.a, str)) {
                if (!this.a.j(t6aVarQ.a)) {
                    t6aVarQ = null;
                }
                return t6aVarQ;
            }
            return null;
        }
    }

    public final boolean c(Boolean bool) {
        r8a r8aVar = r8a.SystemSettings;
        synchronized (this.d) {
            t6a t6aVarQ = this.a.q();
            if (t6aVarQ == null) {
                return false;
            }
            if (t6aVarQ.b != r8aVar) {
                return false;
            }
            if (!this.a.j(t6aVarQ.a)) {
                t6aVarQ = null;
            }
            if (t6aVarQ == null) {
                return false;
            }
            this.b.z(t6aVarQ, Boolean.valueOf(bool.booleanValue()));
            return true;
        }
    }
}
