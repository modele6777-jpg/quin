package defpackage;

import android.content.Context;
import android.media.MediaPlayer;
import java.io.File;

/* JADX INFO: compiled from: r8-map-id-c0f90335ad52c1b57db77aaf4b1db5c7c9c2627f2e01f059a43261b6162c0147 */
/* JADX INFO: loaded from: classes.dex */
public final class je0 implements hf8 {
    public static final /* synthetic */ int Y = 0;
    public final p X;
    public final Context a;
    public final yt6 b;
    public final qn2 c;
    public MediaPlayer d;
    public lyd e;
    public lyd f;
    public final vz9 g;
    public final vz9 v;
    public final vz9 w;
    public final vz9 x;
    public final vz9 y;
    public final vz9 z;

    public je0(Context context, yt6 yt6Var) {
        this.a = context;
        this.b = yt6Var;
        t8e t8eVarD = iqf.d();
        js3 js3Var = ga4.a;
        this.c = jgb.k(i7h.I(t8eVarD, mk8.a.f));
        this.g = q1c.f(null);
        Boolean bool = Boolean.FALSE;
        this.v = q1c.f(bool);
        this.w = q1c.f(bool);
        this.x = q1c.f(Float.valueOf(0.0f));
        this.y = q1c.f("");
        this.z = q1c.f(bool);
        this.X = new p(9, this);
    }

    public final File a(String str) {
        return new File(this.a.getCacheDir(), ib8.j("asset_audio_", str, ".wav"));
    }

    public final void b() {
        if (m93.m == this.X) {
            m93.m = null;
        }
        e(false);
        this.x.setValue(Float.valueOf(0.0f));
        lyd lydVar = this.e;
        if (lydVar != null) {
            lydVar.h(null);
        }
        this.e = null;
        try {
            MediaPlayer mediaPlayer = this.d;
            if (mediaPlayer != null) {
                mediaPlayer.seekTo(0);
            }
        } catch (Exception e) {
            d().c("seekTo(0) failed, releasing MediaPlayer", e);
            MediaPlayer mediaPlayer2 = this.d;
            if (mediaPlayer2 != null) {
                mediaPlayer2.release();
            }
            this.d = null;
        }
    }

    public final void c() {
        lyd lydVar = this.f;
        if (lydVar != null) {
            lydVar.h(null);
        }
        if (m93.m == this.X) {
            m93.m = null;
        }
        lyd lydVar2 = this.e;
        if (lydVar2 != null) {
            lydVar2.h(null);
        }
        this.e = null;
        MediaPlayer mediaPlayer = this.d;
        if (mediaPlayer != null) {
            mediaPlayer.release();
        }
        this.d = null;
        this.g.setValue(null);
        e(false);
        this.x.setValue(Float.valueOf(0.0f));
        this.y.setValue("");
        Boolean bool = Boolean.FALSE;
        this.v.setValue(bool);
        this.z.setValue(bool);
    }

    public final void e(boolean z) {
        this.w.setValue(Boolean.valueOf(z));
    }

    public final void f(String str) {
        str.getClass();
        if (!pa7.t((String) this.g.getValue(), str) || ((Boolean) this.v.getValue()).booleanValue() || ((Boolean) this.z.getValue()).booleanValue()) {
            return;
        }
        MediaPlayer mediaPlayer = this.d;
        int i = 0;
        if (((Boolean) this.w.getValue()).booleanValue()) {
            if (mediaPlayer != null) {
                mediaPlayer.pause();
            }
            e(false);
            lyd lydVar = this.e;
            if (lydVar != null) {
                lydVar.h(null);
            }
            this.e = null;
            return;
        }
        p pVar = this.X;
        if (mediaPlayer != null) {
            x16 x16Var = m93.m;
            if (x16Var != pVar) {
                if (x16Var != null) {
                    x16Var.invoke();
                }
                m93.m = pVar;
            }
            mediaPlayer.start();
            e(true);
            lyd lydVar2 = this.e;
            if (lydVar2 != null) {
                lydVar2.h(null);
            }
            this.e = ynb.V(this.c, null, null, new ie0(this, null), 3);
            return;
        }
        File fileA = a(str);
        if (fileA.exists()) {
            x16 x16Var2 = m93.m;
            if (x16Var2 != pVar) {
                if (x16Var2 != null) {
                    x16Var2.invoke();
                }
                m93.m = pVar;
            }
            MediaPlayer mediaPlayer2 = new MediaPlayer();
            mediaPlayer2.setDataSource(fileA.getAbsolutePath());
            mediaPlayer2.setOnPreparedListener(new ce0(this, i));
            mediaPlayer2.setOnCompletionListener(new de0(this, i));
            mediaPlayer2.setOnErrorListener(new MediaPlayer.OnErrorListener() { // from class: ee0
                @Override // android.media.MediaPlayer.OnErrorListener
                public final boolean onError(MediaPlayer mediaPlayer3, int i2, int i3) {
                    je0 je0Var = this.a;
                    je0Var.d().b("MediaPlayer error: what=" + i2 + ", extra=" + i3);
                    je0Var.b();
                    return true;
                }
            });
            mediaPlayer2.prepareAsync();
            this.d = mediaPlayer2;
        }
    }
}
