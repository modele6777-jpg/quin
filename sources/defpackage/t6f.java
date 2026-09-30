package defpackage;

import ai.askquin.R;
import android.content.Context;
import java.io.File;
import tech.chatmind.api.PauseReadingAudioStatus;

/* JADX INFO: compiled from: r8-map-id-c0f90335ad52c1b57db77aaf4b1db5c7c9c2627f2e01f059a43261b6162c0147 */
/* JADX INFO: loaded from: classes.dex */
public final class t6f implements hf8 {
    public static final /* synthetic */ int F0 = 0;
    public final h2e E0;
    public final s0e X;
    public final whb Y;
    public qj2 Z;
    public final Context a;
    public final o8b b;
    public final i6f c;
    public final qn2 d;
    public lyd e;
    public lyd f;
    public long g;
    public boolean v;
    public boolean w;
    public boolean x;
    public boolean y;
    public boolean z;

    public t6f(Context context, o8b o8bVar, i6f i6fVar) {
        this.a = context;
        this.b = o8bVar;
        this.c = i6fVar;
        t8e t8eVarD = iqf.d();
        js3 js3Var = ga4.a;
        qn2 qn2VarK = jgb.k(i7h.I(t8eVarD, mk8.a.f));
        this.d = qn2VarK;
        s0e s0eVarA = t0e.a(new w6f(null, 31));
        this.X = s0eVarA;
        this.Y = if9.n(s0eVarA);
        ok8.C(new kl5(if9.n(((bp3) o8bVar).X), new j6f(this, null), 1), qn2VarK);
        this.E0 = new h2e(15, this);
    }

    public final void a(String str, String str2, long j) {
        if (c(j, str)) {
            d().b("TTS playback failed for chatId=" + str + ": " + str2);
            jcc.k(0, Integer.valueOf(R.string.tts_error_generate_failed));
            k();
        }
    }

    public final File b(String str) {
        return new File(this.a.getCacheDir(), ib8.j("tts/tts_", str, ".mp3"));
    }

    public final boolean c(long j, String str) {
        return this.g == j && pa7.t(((w6f) this.X.getValue()).a, str);
    }

    public final void e(String str) {
        if (this.y) {
            return;
        }
        this.w = false;
        this.y = true;
        i6f i6fVar = this.c;
        str.getClass();
        synchronized (i6fVar.e) {
            dg7 dg7Var = (dg7) i6fVar.c.get(str);
            if (dg7Var != null) {
                if (!dg7Var.b()) {
                    dg7Var = null;
                }
                if (dg7Var != null) {
                    return;
                }
            }
            i6fVar.d.remove(str);
            mmb mmbVar = new mmb();
            lyd lydVarV = ynb.V(i6fVar.b, null, dw2.b, new h6f(i6fVar, str, mmbVar, null), 1);
            mmbVar.element = lydVarV;
            i6fVar.c.put(str, lydVarV);
            Object obj = mmbVar.element;
            if (obj == null) {
                pa7.g0("job");
                throw null;
            }
            ((dg7) obj).start();
        }
    }

    public final void f(long j, String str) {
        if (c(j, str)) {
            boolean z = this.v;
            String str2 = null;
            o8b o8bVar = this.b;
            if (z && !this.w) {
                this.w = true;
                ((bp3) o8bVar).f();
                this.f = ynb.V(this.d, null, null, new l6f(this, str, j, null), 3);
                return;
            }
            if (m93.m == this.E0) {
                m93.m = null;
            }
            ((bp3) o8bVar).i();
            qj2 qj2Var = this.Z;
            if (qj2Var != null) {
                qj2Var.invoke();
            }
            this.z = false;
            w6f w6fVar = new w6f(str2, 31);
            s0e s0eVar = this.X;
            s0eVar.getClass();
            s0eVar.n(null, w6fVar);
        }
    }

    public final void g() {
        Object value;
        w6f w6fVarA;
        s0e s0eVar = this.X;
        w6f w6fVar = (w6f) s0eVar.getValue();
        String str = w6fVar.a;
        if (str == null) {
            return;
        }
        d6f d6fVar = w6fVar.b;
        d6f d6fVar2 = d6f.b;
        d6f d6fVar3 = d6f.d;
        if (d6fVar == d6fVar2 || d6fVar == d6f.c || d6fVar == d6fVar3) {
            lyd lydVar = this.e;
            if (lydVar != null) {
                lydVar.h(null);
            }
            this.e = null;
            this.z = false;
            lyd lydVar2 = this.f;
            if (lydVar2 != null) {
                lydVar2.h(null);
            }
            this.f = null;
            ((bp3) this.b).f();
            e(str);
            this.v = true;
            do {
                value = s0eVar.getValue();
                w6fVarA = (w6f) value;
                if (pa7.t(w6fVarA.a, str)) {
                    w6fVarA = w6f.a(w6fVarA, d6fVar3, 0L, 0L, 0L, 29);
                }
            } while (!s0eVar.l(value, w6fVarA));
        }
    }

    public final void h() {
        w6f w6fVar = (w6f) this.X.getValue();
        String str = w6fVar.a;
        if (str != null && w6fVar.b == d6f.d) {
            this.z = true;
            lyd lydVar = this.f;
            if (lydVar == null || !lydVar.b()) {
                this.f = ynb.V(this.d, null, null, new m6f(this, str, this.g, null), 3);
            }
        }
    }

    public final void i(long j) {
        long j2;
        Object value;
        w6f w6fVar = (w6f) this.X.getValue();
        if (w6fVar.a == null) {
            return;
        }
        long j3 = w6fVar.d;
        if (j3 <= 0) {
            j3 = w6fVar.e;
            if (j3 <= 0) {
                return;
            }
        }
        long jQ = mh3.q(w6fVar.c + j, 0L, j3);
        bp3 bp3Var = (bp3) this.b;
        y45 y45Var = bp3Var.b;
        if (y45Var != null) {
            long jP = y45Var.p();
            long jD = y45Var.d();
            if (jP != -9223372036854775807L && jP > 0) {
                j2 = jP;
            } else if (jD <= 0) {
                return;
            } else {
                j2 = jD;
            }
            long jQ2 = mh3.q(jQ, 0L, j2);
            y45Var.I(jQ2);
            s0e s0eVar = bp3Var.X;
            do {
                value = s0eVar.getValue();
            } while (!s0eVar.l(value, xha.a((xha) value, false, false, jQ2, 0L, 0L, null, 59)));
        }
    }

    public final void j(String str, PauseReadingAudioStatus pauseReadingAudioStatus, boolean z) {
        long j = this.g + 1;
        this.g = j;
        this.v = false;
        this.w = false;
        this.x = false;
        this.y = false;
        this.z = true;
        w6f w6fVar = new w6f(str, 28);
        s0e s0eVar = this.X;
        s0eVar.getClass();
        s0eVar.n(null, w6fVar);
        this.e = ynb.V(this.d, null, null, new s6f(z, pauseReadingAudioStatus, this, str, j, null), 3);
    }

    public final void k() {
        boolean z;
        int iOrdinal;
        s0e s0eVar = this.X;
        w6f w6fVar = (w6f) s0eVar.getValue();
        if (w6fVar.a == null || (iOrdinal = w6fVar.b.ordinal()) == 0) {
            z = false;
        } else {
            if (iOrdinal != 1 && iOrdinal != 2 && iOrdinal != 3) {
                ap.c();
                return;
            }
            z = true;
        }
        boolean z2 = z && w6fVar.b != d6f.d;
        this.g++;
        lyd lydVar = this.e;
        String str = null;
        if (lydVar != null) {
            lydVar.h(null);
        }
        this.e = null;
        lyd lydVar2 = this.f;
        if (lydVar2 != null) {
            lydVar2.h(null);
        }
        this.f = null;
        if (m93.m == this.E0) {
            m93.m = null;
        }
        o8b o8bVar = this.b;
        if (z2) {
            ((bp3) o8bVar).f();
        }
        if (z) {
            String str2 = w6fVar.a;
            if (str2 == null) {
                qc0.j("Required value was null.");
                return;
            }
            e(str2);
        }
        ((bp3) o8bVar).i();
        this.v = false;
        this.w = false;
        this.x = false;
        this.y = false;
        this.z = false;
        w6f w6fVar2 = new w6f(str, 31);
        s0eVar.getClass();
        s0eVar.n(null, w6fVar2);
    }
}
