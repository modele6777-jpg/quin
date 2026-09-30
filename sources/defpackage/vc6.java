package defpackage;

import android.content.Context;
import android.content.pm.ApplicationInfo;
import android.content.pm.PackageInfo;
import android.content.pm.PackageManager;
import android.content.pm.Signature;
import android.content.pm.SigningInfo;
import android.os.Build;
import android.os.Parcel;
import android.os.RemoteException;
import android.os.StrictMode;
import android.util.Log;
import io.sentry.android.core.b1;
import java.util.Arrays;

/* JADX INFO: compiled from: r8-map-id-c0f90335ad52c1b57db77aaf4b1db5c7c9c2627f2e01f059a43261b6162c0147 */
/* JADX INFO: loaded from: classes3.dex */
public final class vc6 {
    public static vc6 c;
    public final Context a;
    public volatile String b;

    public vc6(Context context) {
        this.a = context.getApplicationContext();
    }

    public static vc6 a(Context context) {
        vc6 vc6Var;
        oa7.A(context);
        synchronized (vc6.class) {
            vc6Var = c;
            if (vc6Var == null) {
                vvg vvgVar = zah.a;
                synchronized (zah.class) {
                    if (zah.e == null) {
                        zah.e = context.getApplicationContext();
                    } else {
                        b1.l("GoogleCertificates", "GoogleCertificates has been initialized already");
                    }
                }
                vc6Var = new vc6(context);
                c = vc6Var;
            }
        }
        return vc6Var;
    }

    public static final boolean c(PackageInfo packageInfo, boolean z) {
        jqg jqgVar;
        int i;
        if (packageInfo != null) {
            if (z && ("com.android.vending".equals(packageInfo.packageName) || "com.google.android.gms".equals(packageInfo.packageName))) {
                ApplicationInfo applicationInfo = packageInfo.applicationInfo;
                z = (applicationInfo == null || (applicationInfo.flags & 129) == 0) ? false : true;
            }
            try {
                jqg jqgVar2 = z ? y9h.c : y9h.b;
                int i2 = Build.VERSION.SDK_INT;
                if (i2 < 28) {
                    Signature[] signatureArr = packageInfo.signatures;
                    byte[] byteArray = null;
                    if (signatureArr != null && signatureArr.length == 1) {
                        byteArray = signatureArr[0].toByteArray();
                    }
                    if (byteArray != null) {
                        rmg rmgVar = uog.d;
                        Object[] objArr = {byteArray};
                        vtb.x(1, objArr);
                        jqgVar = new jqg(1, objArr);
                    } else {
                        rmg rmgVar2 = uog.d;
                        jqgVar = jqg.g;
                    }
                } else {
                    if (i2 < 28) {
                        throw new IllegalStateException();
                    }
                    SigningInfo signingInfo = packageInfo.signingInfo;
                    if (signingInfo == null || signingInfo.hasMultipleSigners() || signingInfo.getSigningCertificateHistory() == null) {
                        rmg rmgVar3 = uog.d;
                        jqgVar = jqg.g;
                    } else {
                        rmg rmgVar4 = uog.d;
                        Object[] objArrCopyOf = new Object[4];
                        Signature[] signingCertificateHistory = signingInfo.getSigningCertificateHistory();
                        int length = signingCertificateHistory.length;
                        int i3 = 0;
                        int i4 = 0;
                        while (i3 < length) {
                            byte[] byteArray2 = signingCertificateHistory[i3].toByteArray();
                            byteArray2.getClass();
                            int length2 = objArrCopyOf.length;
                            int i5 = i4 + 1;
                            if (i5 < 0) {
                                throw new IllegalArgumentException("cannot store more than Integer.MAX_VALUE elements");
                            }
                            if (i5 <= length2) {
                                i = length2;
                            } else {
                                i = (length2 >> 1) + length2 + 1;
                                if (i < i5) {
                                    int iHighestOneBit = Integer.highestOneBit(i4);
                                    i = iHighestOneBit + iHighestOneBit;
                                }
                                if (i < 0) {
                                    i = Integer.MAX_VALUE;
                                }
                            }
                            if (i > length2) {
                                objArrCopyOf = Arrays.copyOf(objArrCopyOf, i);
                            }
                            objArrCopyOf[i4] = byteArray2;
                            i3++;
                            i4 = i5;
                        }
                        jqgVar = i4 == 0 ? jqg.g : new jqg(i4, objArrCopyOf);
                    }
                }
                if (jqgVar.isEmpty()) {
                    throw new IllegalArgumentException("Unable to obtain package certificate history.");
                }
                uog uogVarM = jqgVar.m();
                int size = uogVarM.size();
                int i6 = 0;
                while (i6 < size) {
                    byte[] bArr = (byte[]) uogVarM.get(i6);
                    rmg rmgVarListIterator = jqgVar2.listIterator(0);
                    do {
                        int i7 = i6 + 1;
                        if (!rmgVarListIterator.hasNext()) {
                            i6 = i7;
                        }
                    } while (!Arrays.equals(bArr, (byte[]) rmgVarListIterator.next()));
                    return true;
                }
            } catch (IllegalArgumentException unused) {
                Log.i("GoogleSignatureVerifier", "package info is not set correctly");
                if ((z ? d(packageInfo, y9h.a) : d(packageInfo, y9h.a[0])) == null) {
                    return false;
                }
            }
        }
        return false;
    }

    public static x4h d(PackageInfo packageInfo, x4h... x4hVarArr) {
        Signature[] signatureArr = packageInfo.signatures;
        if (signatureArr != null) {
            if (signatureArr.length != 1) {
                b1.l("GoogleSignatureVerifier", "Package has more than one signature.");
                return null;
            }
            k6h k6hVar = new k6h(packageInfo.signatures[0].toByteArray());
            for (int i = 0; i < x4hVarArr.length; i++) {
                if (x4hVarArr[i].equals(k6hVar)) {
                    return x4hVarArr[i];
                }
            }
        }
        return null;
    }

    /* JADX WARN: Code duplicated, block: B:90:0x01c7  */
    public final boolean b(int i) {
        egh eghVarO;
        int length;
        ApplicationInfo applicationInfo;
        String[] packagesForUid = this.a.getPackageManager().getPackagesForUid(i);
        if (packagesForUid == null || (length = packagesForUid.length) == 0) {
            eghVarO = egh.o("no pkgs");
        } else {
            eghVarO = null;
            int i2 = 0;
            while (true) {
                if (i2 >= length) {
                    oa7.A(eghVarO);
                    break;
                }
                String str = packagesForUid[i2];
                if (str == null) {
                    eghVarO = egh.o("null pkg");
                } else if (str.equals(this.b)) {
                    eghVarO = egh.e;
                } else {
                    vvg vvgVar = zah.a;
                    StrictMode.ThreadPolicy threadPolicyAllowThreadDiskReads = StrictMode.allowThreadDiskReads();
                    try {
                        try {
                            zah.a();
                            boolean zO = ((tkg) zah.c).O();
                            StrictMode.setThreadPolicy(threadPolicyAllowThreadDiskReads);
                            if (zO) {
                                boolean zA = sc6.a(this.a);
                                StrictMode.ThreadPolicy threadPolicyAllowThreadDiskReads2 = StrictMode.allowThreadDiskReads();
                                try {
                                    oa7.A(zah.e);
                                    try {
                                        zah.a();
                                        oa7.A(zah.e);
                                        Context context = (Context) tk9.N(tk9.M(new tk9(zah.e)));
                                        try {
                                            tkg tkgVar = (tkg) zah.c;
                                            Parcel parcelJ = tkgVar.J();
                                            int i3 = itg.a;
                                            parcelJ.writeInt(1);
                                            int iB = hcc.B(parcelJ, 20293);
                                            hcc.v(parcelJ, 1, str);
                                            hcc.z(parcelJ, 2, 4);
                                            parcelJ.writeInt(zA ? 1 : 0);
                                            hcc.z(parcelJ, 3, 4);
                                            parcelJ.writeInt(0);
                                            hcc.s(parcelJ, 4, new tk9(context));
                                            hcc.z(parcelJ, 5, 4);
                                            parcelJ.writeInt(0);
                                            hcc.z(parcelJ, 6, 4);
                                            parcelJ.writeInt(1);
                                            hcc.z(parcelJ, 8, 4);
                                            parcelJ.writeInt(0);
                                            hcc.C(parcelJ, iB);
                                            Parcel parcelH = tkgVar.H(parcelJ, 6);
                                            ldh ldhVar = (ldh) itg.a(parcelH, ldh.CREATOR);
                                            parcelH.recycle();
                                            if (ldhVar.a) {
                                                w6c.z(ldhVar.d);
                                                Object obj = null;
                                                eghVarO = new egh(true, obj, obj, 0);
                                            } else {
                                                String str2 = ldhVar.b;
                                                PackageManager.NameNotFoundException nameNotFoundException = iqf.r(ldhVar.c) == 4 ? new PackageManager.NameNotFoundException() : null;
                                                if (str2 == null) {
                                                    str2 = "error checking package certificate";
                                                }
                                                w6c.z(ldhVar.d);
                                                iqf.r(ldhVar.c);
                                                eghVarO = new egh(false, str2, nameNotFoundException, 0 == true ? 1 : 0);
                                            }
                                        } catch (RemoteException e) {
                                            b1.e("GoogleCertificates", "Failed to get Google certificates from remote", e);
                                            eghVarO = egh.p(e, "module call");
                                        }
                                    } catch (zr4 e2) {
                                        b1.e("GoogleCertificates", "Failed to get Google certificates from remote", e2);
                                        eghVarO = egh.p(e2, "module init: ".concat(String.valueOf(e2.getMessage())));
                                    }
                                    StrictMode.setThreadPolicy(threadPolicyAllowThreadDiskReads2);
                                } catch (Throwable th) {
                                    StrictMode.setThreadPolicy(threadPolicyAllowThreadDiskReads2);
                                    throw th;
                                }
                            } else {
                                try {
                                    PackageInfo packageInfo = this.a.getPackageManager().getPackageInfo(str, Build.VERSION.SDK_INT >= 28 ? 134217792 : 64);
                                    boolean zA2 = sc6.a(this.a);
                                    if (packageInfo == null) {
                                        eghVarO = egh.o("null pkg");
                                    } else {
                                        Signature[] signatureArr = packageInfo.signatures;
                                        if (signatureArr == null || signatureArr.length != 1) {
                                            eghVarO = egh.o("single cert required");
                                        } else {
                                            k6h k6hVar = new k6h(packageInfo.signatures[0].toByteArray());
                                            String str3 = packageInfo.packageName;
                                            StrictMode.ThreadPolicy threadPolicyAllowThreadDiskReads3 = StrictMode.allowThreadDiskReads();
                                            try {
                                                egh eghVarB = zah.b(str3, k6hVar, zA2, false);
                                                StrictMode.setThreadPolicy(threadPolicyAllowThreadDiskReads3);
                                                if (eghVarB.b && (applicationInfo = packageInfo.applicationInfo) != null && (applicationInfo.flags & 2) != 0) {
                                                    StrictMode.ThreadPolicy threadPolicyAllowThreadDiskReads4 = StrictMode.allowThreadDiskReads();
                                                    try {
                                                        egh eghVarB2 = zah.b(str3, k6hVar, false, true);
                                                        StrictMode.setThreadPolicy(threadPolicyAllowThreadDiskReads4);
                                                        if (eghVarB2.b) {
                                                            eghVarO = egh.o("debuggable release cert app rejected");
                                                        }
                                                    } catch (Throwable th2) {
                                                        StrictMode.setThreadPolicy(threadPolicyAllowThreadDiskReads4);
                                                        throw th2;
                                                    }
                                                }
                                                eghVarO = eghVarB;
                                            } catch (Throwable th3) {
                                                StrictMode.setThreadPolicy(threadPolicyAllowThreadDiskReads3);
                                                throw th3;
                                            }
                                        }
                                    }
                                    if (eghVarO.b) {
                                        this.b = str;
                                    }
                                } catch (PackageManager.NameNotFoundException e3) {
                                    eghVarO = egh.p(e3, "no pkg ".concat(str));
                                }
                            }
                        } catch (RemoteException | zr4 e4) {
                            b1.e("GoogleCertificates", "Failed to get Google certificates from remote", e4);
                            StrictMode.setThreadPolicy(threadPolicyAllowThreadDiskReads);
                        }
                        if (eghVarO.b) {
                            this.b = str;
                        }
                    } catch (Throwable th4) {
                        StrictMode.setThreadPolicy(threadPolicyAllowThreadDiskReads);
                        throw th4;
                    }
                }
                if (eghVarO.b) {
                    break;
                }
                i2++;
            }
        }
        if (!eghVarO.b && Log.isLoggable("GoogleCertificatesRslt", 3)) {
            Throwable th5 = (Throwable) eghVarO.d;
            if (th5 != null) {
                Log.d("GoogleCertificatesRslt", eghVarO.l(), th5);
            } else {
                Log.d("GoogleCertificatesRslt", eghVarO.l());
            }
        }
        return eghVarO.b;
    }
}
