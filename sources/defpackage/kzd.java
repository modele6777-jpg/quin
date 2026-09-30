package defpackage;

import ai.askquin.ui.conversation.r0;
import ai.askquin.ui.draw.model.DrawCardSaves;
import android.content.Context;

/* JADX INFO: compiled from: r8-map-id-c0f90335ad52c1b57db77aaf4b1db5c7c9c2627f2e01f059a43261b6162c0147 */
/* JADX INFO: loaded from: classes.dex */
public final class kzd implements hf8 {
    public static final /* synthetic */ int e = 0;
    public final Context a;
    public final r0 b;
    public final cb9 c;
    public final trd d;

    public kzd(Context context, r0 r0Var, cb9 cb9Var, dc9 dc9Var, q9b q9bVar, fab fabVar, trd trdVar) {
        context.getClass();
        r0Var.getClass();
        dc9Var.getClass();
        q9bVar.getClass();
        fabVar.getClass();
        this.a = context;
        this.b = r0Var;
        this.c = cb9Var;
        this.d = trdVar;
    }

    public final void a(DrawCardSaves drawCardSaves, String str) {
        x1f x1fVar = x1f.a;
        x1f.g(new r05("spread_chose"), m1f.a, new bv9(drawCardSaves, str, this, 14));
    }
}
