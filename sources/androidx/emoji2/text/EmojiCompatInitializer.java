package androidx.emoji2.text;

import android.content.Context;
import androidx.lifecycle.ProcessLifecycleInitializer;
import defpackage.bs;
import defpackage.c37;
import defpackage.h48;
import defpackage.jt4;
import defpackage.kt4;
import defpackage.lq5;
import defpackage.ta0;
import defpackage.x48;
import java.util.Collections;
import java.util.List;

/* JADX INFO: compiled from: r8-map-id-c0f90335ad52c1b57db77aaf4b1db5c7c9c2627f2e01f059a43261b6162c0147 */
/* JADX INFO: loaded from: classes.dex */
public class EmojiCompatInitializer implements c37 {
    @Override // defpackage.c37
    public final List a() {
        return Collections.singletonList(ProcessLifecycleInitializer.class);
    }

    @Override // defpackage.c37
    public final Object b(Context context) {
        lq5 lq5Var = new lq5(new bs(context, 1));
        lq5Var.a = 1;
        if (jt4.k == null) {
            synchronized (jt4.j) {
                try {
                    if (jt4.k == null) {
                        jt4.k = new jt4(lq5Var);
                    }
                } catch (Throwable th) {
                    throw th;
                }
            }
        }
        h48 h48VarK = ((x48) ta0.v(context).n(ProcessLifecycleInitializer.class)).k();
        h48VarK.a(new kt4(this, h48VarK));
        return Boolean.TRUE;
    }
}
