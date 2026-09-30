package defpackage;

import android.content.ContentResolver;
import android.database.ContentObserver;
import android.net.Uri;
import android.os.Handler;
import java.util.LinkedHashSet;

/* JADX INFO: compiled from: r8-map-id-c0f90335ad52c1b57db77aaf4b1db5c7c9c2627f2e01f059a43261b6162c0147 */
/* JADX INFO: loaded from: classes.dex */
public final class cgc extends ContentObserver {
    public final /* synthetic */ lmb a;
    public final /* synthetic */ lmb b;
    public final /* synthetic */ x48 c;
    public final /* synthetic */ int d;
    public final /* synthetic */ ContentResolver e;
    public final /* synthetic */ imb f;
    public final /* synthetic */ LinkedHashSet g;
    public final /* synthetic */ vx7 h;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public cgc(lmb lmbVar, lmb lmbVar2, x48 x48Var, int i, ContentResolver contentResolver, imb imbVar, LinkedHashSet linkedHashSet, vx7 vx7Var, Handler handler) {
        super(handler);
        this.a = lmbVar;
        this.b = lmbVar2;
        this.c = x48Var;
        this.d = i;
        this.e = contentResolver;
        this.f = imbVar;
        this.g = linkedHashSet;
        this.h = vx7Var;
    }

    @Override // android.database.ContentObserver
    public final void onChange(boolean z, Uri uri) {
        hgc.F(this.a, this.b, this.c, this.d, this.e, this.f, this.g, this.h, uri, 0);
    }

    @Override // android.database.ContentObserver
    public final void onChange(boolean z, Uri uri, int i) {
        hgc.F(this.a, this.b, this.c, this.d, this.e, this.f, this.g, this.h, uri, i);
    }
}
