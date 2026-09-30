package defpackage;

import android.graphics.Typeface;
import android.text.TextUtils;
import android.widget.TextView;
import java.util.ArrayList;
import java.util.concurrent.CancellationException;
import java.util.concurrent.ExecutionException;
import java.util.concurrent.atomic.AtomicInteger;

/* JADX INFO: compiled from: r8-map-id-c0f90335ad52c1b57db77aaf4b1db5c7c9c2627f2e01f059a43261b6162c0147 */
/* JADX INFO: loaded from: classes3.dex */
public final class q90 implements Runnable {
    public final /* synthetic */ int a = 0;
    public final /* synthetic */ int b;
    public final /* synthetic */ Object c;
    public final /* synthetic */ Object d;

    public /* synthetic */ q90(ogg oggVar, int i, String str) {
        this.c = oggVar;
        this.b = i;
        this.d = str;
    }

    @Override // java.lang.Runnable
    public final void run() {
        ArrayList arrayList;
        la1 la1Var;
        ArrayList arrayList2;
        int i = this.a;
        Object obj = this.d;
        int i2 = this.b;
        Object obj2 = this.c;
        switch (i) {
            case 0:
                TextView textView = (TextView) obj2;
                Typeface typeface = (Typeface) obj;
                ej8 ej8Var = s90.a;
                String fontVariationSettings = textView.getFontVariationSettings();
                if (!TextUtils.isEmpty(fontVariationSettings)) {
                    s90.a(textView, null);
                }
                textView.setTypeface(typeface, i2);
                if (TextUtils.isEmpty(fontVariationSettings)) {
                    return;
                }
                s90.a(textView, fontVariationSettings);
                return;
            case 1:
                o78 o78Var = (o78) obj;
                m88 m88Var = (m88) obj2;
                boolean z = o78Var.c;
                AtomicInteger atomicInteger = o78Var.d;
                ArrayList arrayList3 = o78Var.b;
                if (o78Var.isDone() || arrayList3 == null) {
                    ok8.o("Future was done before all dependencies completed", z);
                    return;
                }
                try {
                    ok8.o("Tried to set value from future which is not done", m88Var.isDone());
                    arrayList3.set(i2, bm8.A(m88Var));
                    int iDecrementAndGet = atomicInteger.decrementAndGet();
                    ok8.o("Less than 0 remaining futures", iDecrementAndGet >= 0);
                    if (iDecrementAndGet == 0) {
                        if (arrayList != null) {
                            la1Var = o78Var.f;
                            arrayList2 = new ArrayList(arrayList);
                            la1Var.b(arrayList2);
                            return;
                        }
                        return;
                    }
                    return;
                } catch (RuntimeException e) {
                    if (z) {
                        o78Var.f.d(e);
                    }
                    int iDecrementAndGet2 = atomicInteger.decrementAndGet();
                    ok8.o("Less than 0 remaining futures", iDecrementAndGet2 >= 0);
                    if (iDecrementAndGet2 == 0) {
                        if (arrayList != null) {
                            la1Var = o78Var.f;
                            arrayList2 = new ArrayList(arrayList);
                        }
                        return;
                    }
                    return;
                } catch (ExecutionException e2) {
                    if (z) {
                        o78Var.f.d(e2.getCause());
                    }
                    int iDecrementAndGet3 = atomicInteger.decrementAndGet();
                    ok8.o("Less than 0 remaining futures", iDecrementAndGet3 >= 0);
                    if (iDecrementAndGet3 == 0) {
                        if (arrayList != null) {
                            la1Var = o78Var.f;
                            arrayList2 = new ArrayList(arrayList);
                        }
                        return;
                    }
                    return;
                } catch (Error e3) {
                    o78Var.f.d(e3);
                    int iDecrementAndGet4 = atomicInteger.decrementAndGet();
                    ok8.o("Less than 0 remaining futures", iDecrementAndGet4 >= 0);
                    if (iDecrementAndGet4 == 0) {
                        if (arrayList != null) {
                            la1Var = o78Var.f;
                            arrayList2 = new ArrayList(arrayList);
                        }
                        return;
                    }
                    return;
                } catch (CancellationException unused) {
                    if (z) {
                        o78Var.cancel(false);
                    }
                    int iDecrementAndGet5 = atomicInteger.decrementAndGet();
                    ok8.o("Less than 0 remaining futures", iDecrementAndGet5 >= 0);
                    if (iDecrementAndGet5 == 0) {
                        if (arrayList != null) {
                            la1Var = o78Var.f;
                            arrayList2 = new ArrayList(arrayList);
                        }
                        return;
                    }
                    return;
                } finally {
                    int iDecrementAndGet6 = atomicInteger.decrementAndGet();
                    ok8.o("Less than 0 remaining futures", iDecrementAndGet6 >= 0);
                    if (iDecrementAndGet6 == 0) {
                        arrayList = o78Var.b;
                        if (arrayList != null) {
                            o78Var.f.b(new ArrayList(arrayList));
                        } else {
                            ok8.o(null, o78Var.isDone());
                        }
                    }
                }
            default:
                try {
                    ((ogg) obj2).g(i2, (String) obj);
                    return;
                } catch (id8 e4) {
                    ogg.f.f("notifyModuleCompleted failed", e4);
                    return;
                }
        }
    }

    public q90(o78 o78Var, int i, m88 m88Var) {
        this.d = o78Var;
        this.b = i;
        this.c = m88Var;
    }

    public q90(TextView textView, Typeface typeface, int i) {
        this.c = textView;
        this.d = typeface;
        this.b = i;
    }
}
