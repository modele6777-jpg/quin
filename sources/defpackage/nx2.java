package defpackage;

import com.google.firebase.crashlytics.FirebaseCrashlytics;
import com.google.firebase.crashlytics.FirebaseCrashlyticsKt;
import java.util.ArrayList;
import java.util.Arrays;
import timber.log.Timber;

/* JADX INFO: compiled from: r8-map-id-c0f90335ad52c1b57db77aaf4b1db5c7c9c2627f2e01f059a43261b6162c0147 */
/* JADX INFO: loaded from: classes3.dex */
public final class nx2 extends gxe {
    public final /* synthetic */ int b;

    public /* synthetic */ nx2(int i) {
        this.b = i;
    }

    @Override // defpackage.gxe
    public void a(String str, Object... objArr) {
        switch (this.b) {
            case 1:
                for (gxe gxeVar : Timber.c) {
                    gxeVar.a(str, Arrays.copyOf(objArr, objArr.length));
                }
                break;
            default:
                super.a(str, objArr);
                break;
        }
    }

    @Override // defpackage.gxe
    public void b(Throwable th, String str, Object... objArr) {
        switch (this.b) {
            case 1:
                for (gxe gxeVar : Timber.c) {
                    gxeVar.b(th, str, Arrays.copyOf(objArr, objArr.length));
                }
                break;
            default:
                super.b(th, str, objArr);
                break;
        }
    }

    @Override // defpackage.gxe
    public void c(String str, Object... objArr) {
        switch (this.b) {
            case 1:
                for (gxe gxeVar : Timber.c) {
                    gxeVar.c(str, Arrays.copyOf(objArr, objArr.length));
                }
                break;
            default:
                super.c(str, objArr);
                break;
        }
    }

    @Override // defpackage.gxe
    public void d(Throwable th, String str, Object... objArr) {
        switch (this.b) {
            case 1:
                for (gxe gxeVar : Timber.c) {
                    gxeVar.d(th, str, Arrays.copyOf(objArr, objArr.length));
                }
                break;
            default:
                super.d(th, str, objArr);
                break;
        }
    }

    @Override // defpackage.gxe
    public void e(String str, Object... objArr) {
        switch (this.b) {
            case 1:
                for (gxe gxeVar : Timber.c) {
                    gxeVar.e(str, Arrays.copyOf(objArr, objArr.length));
                }
                break;
            default:
                super.e(str, objArr);
                break;
        }
    }

    @Override // defpackage.gxe
    public void f(Throwable th, String str, Object... objArr) {
        switch (this.b) {
            case 1:
                for (gxe gxeVar : Timber.c) {
                    gxeVar.f(th, str, Arrays.copyOf(objArr, objArr.length));
                }
                break;
            default:
                super.f(th, str, objArr);
                break;
        }
    }

    @Override // defpackage.gxe
    public final void g(int i, String str, String str2, Throwable th) {
        int i2 = this.b;
        str2.getClass();
        switch (i2) {
            case 0:
                if (i < 5) {
                    return;
                }
                try {
                    FirebaseCrashlytics firebaseCrashlytics = FirebaseCrashlytics.getInstance();
                    firebaseCrashlytics.getClass();
                    if (str == null) {
                        str = "Quin";
                    }
                    firebaseCrashlytics.log(str + ": " + str2);
                    if (th != null) {
                        Integer num = (Integer) ox2.a.get();
                        if ((num == null || num.intValue() <= 0) && kj0.y0(th)) {
                            FirebaseCrashlyticsKt.recordException(firebaseCrashlytics, th, new lr(2, rs0.s(th)));
                            return;
                        }
                        return;
                    }
                    return;
                } catch (Throwable unused) {
                    return;
                }
            default:
                throw new AssertionError();
        }
    }

    @Override // defpackage.gxe
    public void i(String str, Object... objArr) {
        switch (this.b) {
            case 1:
                for (gxe gxeVar : Timber.c) {
                    gxeVar.i(str, Arrays.copyOf(objArr, objArr.length));
                }
                break;
            default:
                super.i(str, objArr);
                break;
        }
    }

    @Override // defpackage.gxe
    public void j(Throwable th, String str, Object... objArr) {
        switch (this.b) {
            case 1:
                for (gxe gxeVar : Timber.c) {
                    gxeVar.j(th, str, Arrays.copyOf(objArr, objArr.length));
                }
                break;
            default:
                super.j(th, str, objArr);
                break;
        }
    }

    public void k(gxe gxeVar) {
        if (gxeVar == this) {
            qc0.j("Cannot plant Timber into itself.");
            return;
        }
        ArrayList arrayList = Timber.b;
        synchronized (arrayList) {
            arrayList.add(gxeVar);
            Object[] array = arrayList.toArray(new gxe[0]);
            if (array == null) {
                throw new NullPointerException("null cannot be cast to non-null type kotlin.Array<T>");
            }
            Timber.c = (gxe[]) array;
        }
    }

    public void l(String str) {
        str.getClass();
        gxe[] gxeVarArr = Timber.c;
        int length = gxeVarArr.length;
        int i = 0;
        while (i < length) {
            gxe gxeVar = gxeVarArr[i];
            i++;
            gxeVar.a.set(str);
        }
    }
}
