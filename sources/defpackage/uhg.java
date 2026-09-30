package defpackage;

import android.os.SystemClock;
import com.google.android.gms.common.ConnectionResult;
import com.google.android.gms.common.api.Status;
import com.google.android.gms.tasks.Task;

/* JADX INFO: compiled from: r8-map-id-c0f90335ad52c1b57db77aaf4b1db5c7c9c2627f2e01f059a43261b6162c0147 */
/* JADX INFO: loaded from: classes3.dex */
public final class uhg implements xm9 {
    public final ec6 a;
    public final int b;
    public final b70 c;
    public final long d;
    public final long e;

    public uhg(ec6 ec6Var, int i, b70 b70Var, long j, long j2) {
        this.a = ec6Var;
        this.b = i;
        this.c = b70Var;
        this.d = j;
        this.e = j2;
    }

    /* JADX WARN: Code duplicated, block: B:26:0x0031 A[RETURN] */
    public static ik2 a(rhg rhgVar, yt0 yt0Var, int i) {
        y4h y4hVar = yt0Var.w;
        ik2 ik2Var = y4hVar == null ? null : y4hVar.d;
        if (ik2Var != null && ik2Var.b) {
            int[] iArr = ik2Var.d;
            int i2 = 0;
            if (iArr == null) {
                int[] iArr2 = ik2Var.f;
                if (iArr2 != null) {
                    while (i2 < iArr2.length) {
                        if (iArr2[i2] != i) {
                            i2++;
                        }
                    }
                    if (rhgVar.o < ik2Var.e) {
                        return ik2Var;
                    }
                } else if (rhgVar.o < ik2Var.e) {
                    return ik2Var;
                }
            } else {
                while (i2 < iArr.length) {
                    if (iArr[i2] != i) {
                        i2++;
                    } else if (rhgVar.o < ik2Var.e) {
                        return ik2Var;
                    }
                }
            }
        }
        return null;
    }

    @Override // defpackage.xm9
    public final void k(Task task) {
        int i;
        int i2;
        int i3;
        int i4;
        int i5;
        long j;
        long j2;
        ec6 ec6Var = this.a;
        if (ec6Var.f()) {
            n6c n6cVar = (n6c) m6c.A().b;
            if (n6cVar == null || n6cVar.b) {
                rhg rhgVar = (rhg) ec6Var.x.get(this.c);
                if (rhgVar != null) {
                    xb6 xb6Var = rhgVar.e;
                    if (xb6Var instanceof yt0) {
                        xb6 xb6Var2 = xb6Var;
                        long j3 = this.d;
                        int i6 = 0;
                        boolean z = j3 > 0;
                        int i7 = xb6Var2.q;
                        if (n6cVar != null) {
                            z &= n6cVar.c;
                            i = n6cVar.d;
                            i3 = n6cVar.e;
                            i2 = n6cVar.a;
                            if (xb6Var2.w != null && !xb6Var2.q()) {
                                ik2 ik2VarA = a(rhgVar, xb6Var2, this.b);
                                if (ik2VarA == null) {
                                    return;
                                }
                                boolean z2 = ik2VarA.c && j3 > 0;
                                i3 = ik2VarA.e;
                                z = z2;
                            }
                        } else {
                            i = 5000;
                            i2 = 0;
                            i3 = 100;
                        }
                        int i8 = i;
                        int iElapsedRealtime = -1;
                        if (task.m()) {
                            i5 = 0;
                        } else if (task.k()) {
                            i6 = -1;
                            i5 = 100;
                        } else {
                            Exception excH = task.h();
                            if (excH instanceof x60) {
                                Status status = ((x60) excH).mStatus;
                                i4 = status.a;
                                ConnectionResult connectionResult = status.d;
                                if (connectionResult != null) {
                                    i5 = i4;
                                    i6 = connectionResult.b;
                                }
                            } else {
                                i4 = 101;
                            }
                            i5 = i4;
                            i6 = -1;
                        }
                        if (z) {
                            long j4 = this.e;
                            long jCurrentTimeMillis = System.currentTimeMillis();
                            iElapsedRealtime = (int) (SystemClock.elapsedRealtime() - j4);
                            j2 = jCurrentTimeMillis;
                            j = j3;
                        } else {
                            j = 0;
                            j2 = 0;
                        }
                        vhg vhgVar = new vhg(new mv8(this.b, i5, i6, j, j2, null, null, i7, iElapsedRealtime), i2, i8, i3);
                        sig sigVar = ec6Var.X;
                        sigVar.sendMessage(sigVar.obtainMessage(18, vhgVar));
                    }
                }
            }
        }
    }
}
