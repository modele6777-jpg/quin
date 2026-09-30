package defpackage;

import android.os.Bundle;
import android.os.Handler;
import android.os.Looper;
import android.text.Spannable;
import android.text.SpannableString;
import android.text.Spanned;
import android.view.inputmethod.EditorInfo;
import java.nio.ByteBuffer;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.concurrent.locks.ReentrantReadWriteLock;

/* JADX INFO: compiled from: r8-map-id-c0f90335ad52c1b57db77aaf4b1db5c7c9c2627f2e01f059a43261b6162c0147 */
/* JADX INFO: loaded from: classes.dex */
public final class jt4 {
    public static final Object j = new Object();
    public static volatile jt4 k;
    public final ReentrantReadWriteLock a;
    public final od0 b;
    public volatile int c;
    public final Handler d;
    public final nx0 e;
    public final it4 f;
    public final m8c g;
    public final int h;
    public final wq3 i;

    public jt4(lq5 lq5Var) {
        ReentrantReadWriteLock reentrantReadWriteLock = new ReentrantReadWriteLock();
        this.a = reentrantReadWriteLock;
        this.c = 3;
        it4 it4Var = (it4) lq5Var.b;
        this.f = it4Var;
        int i = lq5Var.a;
        this.h = i;
        this.i = (wq3) lq5Var.c;
        this.d = new Handler(Looper.getMainLooper());
        this.b = new od0(0);
        this.g = new m8c(29);
        nx0 nx0Var = new nx0(this);
        this.e = nx0Var;
        reentrantReadWriteLock.writeLock().lock();
        if (i == 0) {
            try {
                this.c = 0;
            } catch (Throwable th) {
                this.a.writeLock().unlock();
                throw th;
            }
        }
        reentrantReadWriteLock.writeLock().unlock();
        if (c() == 0) {
            try {
                it4Var.a(new ft4(nx0Var));
            } catch (Throwable th2) {
                f(th2);
            }
        }
    }

    public static jt4 a() {
        jt4 jt4Var;
        synchronized (j) {
            jt4Var = k;
            ok8.o("EmojiCompat is not initialized.\n\nYou must initialize EmojiCompat prior to referencing the EmojiCompat instance.\n\nThe most likely cause of this error is disabling the EmojiCompatInitializer\neither explicitly in AndroidManifest.xml, or by including\nandroidx.emoji2:emoji2-bundled.\n\nAutomatic initialization is typically performed by EmojiCompatInitializer. If\nyou are not expecting to initialize EmojiCompat manually in your application,\nplease check to ensure it has not been removed from your APK's manifest. You can\ndo this in Android Studio using Build > Analyze APK.\n\nIn the APK Analyzer, ensure that the startup entry for\nEmojiCompatInitializer and InitializationProvider is present in\n AndroidManifest.xml. If it is missing or contains tools:node=\"remove\", and you\nintend to use automatic configuration, verify:\n\n  1. Your application does not include emoji2-bundled\n  2. All modules do not contain an exclusion manifest rule for\n     EmojiCompatInitializer or InitializationProvider. For more information\n     about manifest exclusions see the documentation for the androidx startup\n     library.\n\nIf you intend to use emoji2-bundled, please call EmojiCompat.init. You can\nlearn more in the documentation for BundledEmojiCompatConfig.\n\nIf you intended to perform manual configuration, it is recommended that you call\nEmojiCompat.init immediately on application startup.\n\nIf you still cannot resolve this issue, please open a bug with your specific\nconfiguration to help improve error message.", jt4Var != null);
        }
        return jt4Var;
    }

    public static boolean d() {
        return k != null;
    }

    public final int b(CharSequence charSequence, int i) {
        ok8.o("Not initialized yet", c() == 1);
        ok8.n(charSequence, "charSequence cannot be null");
        ta0 ta0Var = (ta0) this.e.b;
        ta0Var.getClass();
        if (i < 0 || i >= charSequence.length()) {
            return -1;
        }
        if (charSequence instanceof Spanned) {
            Spanned spanned = (Spanned) charSequence;
            h9f[] h9fVarArr = (h9f[]) spanned.getSpans(i, i + 1, h9f.class);
            if (h9fVarArr.length > 0) {
                return spanned.getSpanStart(h9fVarArr[0]);
            }
        }
        return ((vt4) ta0Var.K(charSequence, Math.max(0, i - 16), Math.min(charSequence.length(), i + 16), Integer.MAX_VALUE, true, new vt4(i))).b;
    }

    public final int c() {
        this.a.readLock().lock();
        try {
            return this.c;
        } finally {
            this.a.readLock().unlock();
        }
    }

    public final void e() {
        ok8.o("Set metadataLoadStrategy to LOAD_STRATEGY_MANUAL to execute manual loading", this.h == 1);
        if (c() == 1) {
            return;
        }
        this.a.writeLock().lock();
        try {
            if (this.c == 0) {
                this.a.writeLock().unlock();
                return;
            }
            this.c = 0;
            this.a.writeLock().unlock();
            nx0 nx0Var = this.e;
            jt4 jt4Var = (jt4) nx0Var.a;
            try {
                jt4Var.f.a(new ft4(nx0Var));
            } catch (Throwable th) {
                jt4Var.f(th);
            }
        } catch (Throwable th2) {
            this.a.writeLock().unlock();
            throw th2;
        }
    }

    public final void f(Throwable th) {
        ArrayList arrayList = new ArrayList();
        this.a.writeLock().lock();
        try {
            this.c = 2;
            arrayList.addAll(this.b);
            this.b.clear();
            this.a.writeLock().unlock();
            this.d.post(new qa1(arrayList, this.c, th));
        } catch (Throwable th2) {
            this.a.writeLock().unlock();
            throw th2;
        }
    }

    /* JADX WARN: Code duplicated, block: B:55:0x00ab A[Catch: all -> 0x008e, TryCatch #2 {all -> 0x008e, blocks: (B:35:0x0066, B:38:0x006b, B:40:0x006f, B:42:0x007c, B:49:0x009b, B:51:0x00a5, B:53:0x00a8, B:55:0x00ab, B:57:0x00bb, B:58:0x00be), top: B:94:0x0066 }] */
    /* JADX WARN: Code duplicated, block: B:57:0x00bb A[Catch: all -> 0x008e, TryCatch #2 {all -> 0x008e, blocks: (B:35:0x0066, B:38:0x006b, B:40:0x006f, B:42:0x007c, B:49:0x009b, B:51:0x00a5, B:53:0x00a8, B:55:0x00ab, B:57:0x00bb, B:58:0x00be), top: B:94:0x0066 }] */
    /* JADX WARN: Code duplicated, block: B:64:0x00d3  */
    /* JADX WARN: Code duplicated, block: B:83:0x010a  */
    /* JADX WARN: Code duplicated, block: B:97:? A[SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:99:? A[RETURN, SYNTHETIC] */
    public final CharSequence g(int i, int i2, int i3, CharSequence charSequence) throws Throwable {
        CharSequence charSequence2;
        Throwable th;
        int i4;
        int i5;
        h9f[] h9fVarArr;
        int spanStart;
        ok8.o("Not initialized yet", c() == 1);
        off offVar = null;
        if (i < 0) {
            qc0.j("start cannot be negative");
            return null;
        }
        if (i2 < 0) {
            qc0.j("end cannot be negative");
            return null;
        }
        ok8.k("start should be <= than end", i <= i2);
        if (charSequence == null) {
            return null;
        }
        ok8.k("start should be < than charSequence length", i <= charSequence.length());
        ok8.k("end should be < than charSequence length", i2 <= charSequence.length());
        if (charSequence.length() == 0 || i == i2) {
            return charSequence;
        }
        boolean z = i3 == 1;
        ta0 ta0Var = (ta0) this.e.b;
        ta0Var.getClass();
        boolean z2 = charSequence instanceof aud;
        if (z2) {
            ((aud) charSequence).a();
        }
        if (z2) {
            offVar = new off((Spannable) charSequence);
            if (offVar != null) {
                for (h9f h9fVar : h9fVarArr) {
                    spanStart = offVar.b.getSpanStart(h9fVar);
                    int spanEnd = offVar.b.getSpanEnd(h9fVar);
                    if (spanStart != i2) {
                        offVar.removeSpan(h9fVar);
                    }
                    i = Math.min(spanStart, i);
                    i2 = Math.max(spanEnd, i2);
                }
            }
            i4 = i;
            i5 = i2;
            if (i4 != i5) {
                charSequence2 = charSequence;
                if (!z2) {
                    return charSequence2;
                }
            } else {
                charSequence2 = charSequence;
                if (!z2) {
                    return charSequence2;
                }
            }
            ((aud) charSequence2).b();
            return charSequence2;
        }
        try {
            if (charSequence instanceof Spannable) {
                try {
                    offVar = new off((Spannable) charSequence);
                } catch (Throwable th2) {
                    th = th2;
                    charSequence2 = charSequence;
                    th = th;
                    if (!z2) {
                        throw th;
                    }
                    ((aud) charSequence2).b();
                    throw th;
                }
            } else if ((charSequence instanceof Spanned) && ((Spanned) charSequence).nextSpanTransition(i - 1, i2 + 1, h9f.class) <= i2) {
                offVar = new off();
                offVar.a = false;
                offVar.b = new SpannableString(charSequence);
            }
            if (offVar != null && (h9fVarArr = (h9f[]) offVar.b.getSpans(i, i2, h9f.class)) != null && h9fVarArr.length > 0) {
                while (i < r2) {
                    spanStart = offVar.b.getSpanStart(h9fVar);
                    int spanEnd2 = offVar.b.getSpanEnd(h9fVar);
                    if (spanStart != i2) {
                        offVar.removeSpan(h9fVar);
                    }
                    i = Math.min(spanStart, i);
                    i2 = Math.max(spanEnd2, i2);
                }
            }
            i4 = i;
            i5 = i2;
            if (i4 != i5 || i4 >= charSequence.length()) {
                charSequence2 = charSequence;
                if (!z2) {
                    return charSequence2;
                }
            } else {
                charSequence2 = charSequence;
                try {
                    off offVar2 = (off) ta0Var.K(charSequence2, i4, i5, Integer.MAX_VALUE, z, new fz3(4, offVar, (m8c) ta0Var.c));
                    if (offVar2 != null) {
                        Spannable spannable = offVar2.b;
                        if (z2) {
                            ((aud) charSequence2).b();
                        }
                        return spannable;
                    }
                    if (!z2) {
                        return charSequence2;
                    }
                } catch (Throwable th3) {
                    th = th3;
                    th = th;
                    if (!z2) {
                        throw th;
                    }
                    ((aud) charSequence2).b();
                    throw th;
                }
            }
            ((aud) charSequence2).b();
            return charSequence2;
        } catch (Throwable th4) {
            th = th4;
            charSequence2 = charSequence;
        }
        if (!z2) {
            throw th;
        }
        ((aud) charSequence2).b();
        throw th;
    }

    public final void h(ht4 ht4Var) {
        this.a.writeLock().lock();
        try {
            if (this.c == 1 || this.c == 2) {
                this.d.post(new qa1(Arrays.asList(ht4Var), this.c, (Throwable) null));
            } else {
                this.b.add(ht4Var);
            }
        } finally {
            this.a.writeLock().unlock();
        }
    }

    public final void i(EditorInfo editorInfo) {
        if (c() != 1 || editorInfo == null) {
            return;
        }
        if (editorInfo.extras == null) {
            editorInfo.extras = new Bundle();
        }
        nx0 nx0Var = this.e;
        nx0Var.getClass();
        Bundle bundle = editorInfo.extras;
        bv8 bv8Var = (bv8) ((szc) nx0Var.c).b;
        int iB = bv8Var.b(4);
        bundle.putInt("android.support.text.emoji.emojiCompat_metadataVersion", iB != 0 ? ((ByteBuffer) bv8Var.d).getInt(iB + bv8Var.a) : 0);
        editorInfo.extras.putBoolean("android.support.text.emoji.emojiCompat_replaceAll", false);
    }
}
