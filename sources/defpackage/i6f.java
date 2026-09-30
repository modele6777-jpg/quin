package defpackage;

import java.util.LinkedHashMap;
import java.util.Set;
import tech.chatmind.api.PauseReadingAudioStatus;

/* JADX INFO: compiled from: r8-map-id-c0f90335ad52c1b57db77aaf4b1db5c7c9c2627f2e01f059a43261b6162c0147 */
/* JADX INFO: loaded from: classes.dex */
public final class i6f implements hf8 {
    public static final /* synthetic */ int f = 0;
    public final yt6 a;
    public final qn2 b;
    public final LinkedHashMap c;
    public final LinkedHashMap d;
    public final Object e;

    public i6f(yt6 yt6Var) {
        this.a = yt6Var;
        t8e t8eVarD = iqf.d();
        js3 js3Var = ga4.a;
        this.b = jgb.k(i7h.I(t8eVarD, hr3.c));
        this.c = new LinkedHashMap();
        this.d = new LinkedHashMap();
        this.e = new Object();
    }

    /* JADX WARN: Code duplicated, block: B:7:0x0013  */
    public final Enum a(String str, zn2 zn2Var) {
        e6f e6fVar;
        dg7 dg7Var;
        PauseReadingAudioStatus pauseReadingAudioStatus;
        if (zn2Var instanceof e6f) {
            e6fVar = (e6f) zn2Var;
            int i = e6fVar.label;
            if ((i & Integer.MIN_VALUE) != 0) {
                e6fVar.label = i - Integer.MIN_VALUE;
            } else {
                e6fVar = new e6f(this, zn2Var);
            }
        } else {
            e6fVar = new e6f(this, zn2Var);
        }
        Object obj = e6fVar.result;
        bw2 bw2Var = bw2.a;
        int i2 = e6fVar.label;
        if (i2 != 0) {
            if (i2 != 1) {
                qc0.p("call to 'resume' before 'invoke' with coroutine");
                return null;
            }
            str = (String) e6fVar.L$0;
        }
        jzb.q(obj);
        do {
            synchronized (this.e) {
                dg7Var = (dg7) this.c.get(str);
            }
            if (dg7Var == null) {
                synchronized (this.e) {
                    pauseReadingAudioStatus = (PauseReadingAudioStatus) this.d.remove(str);
                }
                return pauseReadingAudioStatus;
            }
            e6fVar.L$0 = str;
            e6fVar.L$1 = null;
            e6fVar.label = 1;
        } while (dg7Var.U0(e6fVar) != bw2Var);
        return bw2Var;
    }

    public final void b(String str, PauseReadingAudioStatus pauseReadingAudioStatus) {
        synchronized (this.e) {
            this.d.remove(str);
            this.d.put(str, pauseReadingAudioStatus);
            while (this.d.size() > 32) {
                LinkedHashMap linkedHashMap = this.d;
                Set setKeySet = linkedHashMap.keySet();
                setKeySet.getClass();
                linkedHashMap.remove(s72.u0(setKeySet));
            }
        }
    }
}
