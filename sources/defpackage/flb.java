package defpackage;

import android.view.View;
import androidx.recyclerview.widget.RecyclerView;
import com.google.firebase.crashlytics.internal.metadata.UserMetadata;
import io.sentry.android.core.b1;
import java.lang.ref.WeakReference;
import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import java.util.WeakHashMap;

/* JADX INFO: compiled from: r8-map-id-c0f90335ad52c1b57db77aaf4b1db5c7c9c2627f2e01f059a43261b6162c0147 */
/* JADX INFO: loaded from: classes.dex */
public abstract class flb {
    public static final List s = Collections.EMPTY_LIST;
    public final View a;
    public WeakReference b;
    public int i;
    public RecyclerView q;
    public nkb r;
    public int c = -1;
    public int d = -1;
    public int e = -1;
    public int f = -1;
    public flb g = null;
    public flb h = null;
    public final ArrayList j = null;
    public final List k = null;
    public int l = 0;
    public gp3 m = null;
    public boolean n = false;
    public int o = 0;
    public int p = -1;

    public flb(View view) {
        if (view != null) {
            this.a = view;
        } else {
            qc0.j("itemView may not be null");
            throw null;
        }
    }

    public final void a(int i) {
        this.i = i | this.i;
    }

    public final int b() {
        int i = this.f;
        return i == -1 ? this.c : i;
    }

    public final List c() {
        ArrayList arrayList;
        return ((this.i & UserMetadata.MAX_ATTRIBUTE_SIZE) != 0 || (arrayList = this.j) == null || arrayList.size() == 0) ? s : this.k;
    }

    public final boolean d() {
        return (this.i & 1) != 0;
    }

    public final boolean e() {
        return (this.i & 4) != 0;
    }

    public final boolean f() {
        if ((this.i & 16) != 0) {
            return false;
        }
        WeakHashMap weakHashMap = nvf.a;
        return !this.a.hasTransientState();
    }

    public final boolean g() {
        return (this.i & 8) != 0;
    }

    public final boolean h() {
        return this.m != null;
    }

    public final boolean i() {
        return (this.i & 256) != 0;
    }

    public final boolean j() {
        return (this.i & 2) != 0;
    }

    public final void k(int i, boolean z) {
        if (this.d == -1) {
            this.d = this.c;
        }
        int i2 = this.f;
        if (i2 == -1) {
            i2 = this.c;
            this.f = i2;
        }
        if (z) {
            this.f = i2 + i;
        }
        this.c += i;
        View view = this.a;
        if (view.getLayoutParams() != null) {
            ((ukb) view.getLayoutParams()).c = true;
        }
    }

    public final void l() {
        this.i = 0;
        this.c = -1;
        this.d = -1;
        this.f = -1;
        this.l = 0;
        this.g = null;
        this.h = null;
        ArrayList arrayList = this.j;
        if (arrayList != null) {
            arrayList.clear();
        }
        this.i &= -1025;
        this.o = 0;
        this.p = -1;
        RecyclerView.g(this);
    }

    public final void m(boolean z) {
        int i = this.l;
        int i2 = z ? i - 1 : i + 1;
        this.l = i2;
        if (i2 < 0) {
            this.l = 0;
            b1.d("View", "isRecyclable decremented below 0: unmatched pair of setIsRecyable() calls for " + this);
            return;
        }
        if (!z && i2 == 1) {
            this.i |= 16;
        } else if (z && i2 == 0) {
            this.i &= -17;
        }
    }

    public final boolean n() {
        return (this.i & UserMetadata.MAX_ROLLOUT_ASSIGNMENTS) != 0;
    }

    public final boolean o() {
        return (this.i & 32) != 0;
    }

    public final String toString() {
        StringBuilder sbQ = kv2.q(getClass().isAnonymousClass() ? "ViewHolder" : getClass().getSimpleName(), "{");
        sbQ.append(Integer.toHexString(hashCode()));
        sbQ.append(" position=");
        sbQ.append(this.c);
        sbQ.append(" id=-1, oldPos=");
        sbQ.append(this.d);
        sbQ.append(", pLpos:");
        sbQ.append(this.f);
        StringBuilder sb = new StringBuilder(sbQ.toString());
        if (h()) {
            sb.append(" scrap ");
            sb.append(this.n ? "[changeScrap]" : "[attachedScrap]");
        }
        if (e()) {
            sb.append(" invalid");
        }
        if (!d()) {
            sb.append(" unbound");
        }
        if ((this.i & 2) != 0) {
            sb.append(" update");
        }
        if (g()) {
            sb.append(" removed");
        }
        if (n()) {
            sb.append(" ignored");
        }
        if (i()) {
            sb.append(" tmpDetached");
        }
        if (!f()) {
            sb.append(" not recyclable(" + this.l + ")");
        }
        if ((this.i & 512) != 0 || e()) {
            sb.append(" undefined adapter position");
        }
        if (this.a.getParent() == null) {
            sb.append(" no parent");
        }
        sb.append("}");
        return sb.toString();
    }
}
