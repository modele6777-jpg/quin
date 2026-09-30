package defpackage;

import android.content.ContentResolver;
import android.content.Context;
import android.content.Intent;
import android.media.AudioDeviceInfo;
import android.media.AudioManager;
import android.os.Build;
import android.provider.Settings;
import android.util.Pair;
import android.util.SparseArray;
import java.util.HashSet;
import java.util.List;
import java.util.Objects;

/* JADX INFO: compiled from: r8-map-id-c0f90335ad52c1b57db77aaf4b1db5c7c9c2627f2e01f059a43261b6162c0147 */
/* JADX INFO: loaded from: classes.dex */
public final class bj0 {
    public static final yob e;
    public static final bj0 f;
    public static final yob g;
    public static final dpb h;
    public final SparseArray a = new SparseArray();
    public final int b;
    public final jy6 c;
    public final jy6 d;

    static {
        yob yobVarS = jy6.s(12);
        e = yobVarS;
        f = new bj0(jy6.s(aj0.d), yobVarS, yob.e);
        Object[] objArr = {2, 5, 6};
        nk8.n(3, objArr);
        g = jy6.k(3, objArr);
        os osVar = new os(4);
        osVar.q(5, 6);
        osVar.q(17, 6);
        osVar.q(7, 6);
        osVar.q(30, 10);
        osVar.q(18, 6);
        osVar.q(6, 8);
        osVar.q(8, 8);
        osVar.q(14, 8);
        h = osVar.e(true);
    }

    public bj0(yob yobVar, List list, List list2) {
        for (int i = 0; i < yobVar.d; i++) {
            aj0 aj0Var = (aj0) yobVar.get(i);
            this.a.put(aj0Var.a, aj0Var);
        }
        int iMax = 0;
        for (int i2 = 0; i2 < this.a.size(); i2++) {
            iMax = Math.max(iMax, ((aj0) this.a.valueAt(i2)).b);
        }
        this.b = iMax;
        this.c = jy6.o(list);
        this.d = jy6.o(list2);
    }

    public static yob a(int[] iArr, int i) {
        dy6 dy6VarM = jy6.m();
        if (iArr == null) {
            iArr = new int[0];
        }
        for (int i2 : iArr) {
            dy6VarM.b(new aj0(i2, i));
        }
        return dy6VarM.g();
    }

    /* JADX WARN: Code duplicated, block: B:48:0x00c9  */
    /* JADX WARN: Code duplicated, block: B:50:0x00d1  */
    public static bj0 b(Context context, Intent intent, xi0 xi0Var, AudioDeviceInfo audioDeviceInfo, List list) {
        AudioManager audioManagerD0 = kj0.d0(context);
        if (audioDeviceInfo == null) {
            audioDeviceInfo = Build.VERSION.SDK_INT >= 33 ? q6.l(audioManagerD0, xi0Var) : null;
        }
        jy6 jy6VarB = audioDeviceInfo != null ? jud.b(audioDeviceInfo) : e;
        if (Build.VERSION.SDK_INT >= 33 && (pqf.G(context) || context.getPackageManager().hasSystemFeature("android.hardware.type.automotive"))) {
            return q6.k(audioManagerD0, xi0Var, jy6VarB, list);
        }
        for (AudioDeviceInfo audioDeviceInfo2 : audioDeviceInfo == null ? audioManagerD0.getDevices(2) : new AudioDeviceInfo[]{audioDeviceInfo}) {
            if (eb3.M(audioDeviceInfo2.getType())) {
                return new bj0(jy6.s(aj0.d), jy6VarB, list);
            }
        }
        py6 py6Var = new py6(4);
        py6Var.b(2);
        if (Build.VERSION.SDK_INT >= 29 && (pqf.G(context) || context.getPackageManager().hasSystemFeature("android.hardware.type.automotive"))) {
            yob yobVarT = bp.t(xi0Var);
            yobVarT.getClass();
            py6Var.d(yobVarT);
            return new bj0(a(rxg.Z(py6Var.h()), 10), jy6VarB, list);
        }
        ContentResolver contentResolver = context.getContentResolver();
        boolean z = Settings.Global.getInt(contentResolver, "use_external_surround_sound_flag", 0) == 1;
        if (!z) {
            String str = Build.MANUFACTURER;
            if (str.equals("Amazon") || str.equals("Xiaomi")) {
                if (Settings.Global.getInt(contentResolver, "external_surround_sound_enabled", 0) == 1) {
                    yob yobVar = g;
                    yobVar.getClass();
                    py6Var.d(yobVar);
                }
            }
        } else if (Settings.Global.getInt(contentResolver, "external_surround_sound_enabled", 0) == 1) {
            yob yobVar2 = g;
            yobVar2.getClass();
            py6Var.d(yobVar2);
        }
        if (intent == null || z || intent.getIntExtra("android.media.extra.AUDIO_PLUG_STATE", 0) != 1) {
            return new bj0(a(rxg.Z(py6Var.h()), 10), jy6VarB, list);
        }
        int[] intArrayExtra = intent.getIntArrayExtra("android.media.extra.ENCODINGS");
        if (intArrayExtra != null) {
            List listX = rxg.x(intArrayExtra);
            listX.getClass();
            py6Var.d(listX);
        }
        return new bj0(a(rxg.Z(py6Var.h()), intent.getIntExtra("android.media.extra.MAX_CHANNEL_COUNT", 10)), jy6VarB, list);
    }

    /* JADX WARN: Code duplicated, block: B:70:0x00d7  */
    public final Pair c(xi0 xi0Var, rr5 rr5Var) {
        String str = rr5Var.p;
        int iP = rr5Var.K;
        int i = rr5Var.J;
        str.getClass();
        int iB = qv8.b(str, rr5Var.l);
        Integer numValueOf = Integer.valueOf(iB);
        dpb dpbVar = h;
        if (!dpbVar.containsKey(numValueOf)) {
            return null;
        }
        int i2 = 6;
        SparseArray sparseArray = this.a;
        if (iB == 18 && !pqf.j(sparseArray, 18)) {
            iB = 6;
        } else if ((iB == 8 && !pqf.j(sparseArray, 8)) || (iB == 30 && !pqf.j(sparseArray, 30))) {
            iB = 7;
        }
        if (!pqf.j(sparseArray, iB)) {
            return null;
        }
        aj0 aj0Var = (aj0) sparseArray.get(iB);
        aj0Var.getClass();
        int iIntValue = aj0Var.b;
        ry6 ry6Var = aj0Var.c;
        boolean zContains = false;
        if (i == -1 || iB == 18) {
            int i3 = rr5Var.L;
            if (i3 == -1) {
                i3 = 48000;
            }
            int i4 = aj0Var.a;
            if (ry6Var == null) {
                if (Build.VERSION.SDK_INT >= 29) {
                    iIntValue = bp.u(i4, i3, xi0Var);
                } else {
                    Object obj = dpbVar.get(Integer.valueOf(i4));
                    iIntValue = ((Integer) (obj != null ? obj : 0)).intValue();
                }
            }
        } else {
            if (!rr5Var.p.equals("audio/vnd.dts.uhd;profile=p2") || Build.VERSION.SDK_INT >= 33) {
                aj0 aj0Var2 = aj0.d;
                if (ry6Var != null) {
                    int iP2 = iP != -1 ? iP : pqf.p(i);
                    if (iP2 != 0) {
                        zContains = ry6Var.contains(Integer.valueOf(iP2));
                    }
                } else if (i <= iIntValue) {
                    zContains = true;
                }
                if (!zContains) {
                    return null;
                }
            } else if (i > 10) {
                return null;
            }
            iIntValue = i;
        }
        int i5 = Build.VERSION.SDK_INT;
        if (i5 > 28) {
            i2 = iIntValue;
        } else if (iIntValue == 7) {
            i2 = 8;
        } else if (iIntValue != 3 && iIntValue != 4 && iIntValue != 5) {
            i2 = iIntValue;
        }
        HashSet hashSet = pp8.a;
        if (i5 <= 26 && "fugu".equals(Build.DEVICE) && i2 == 1) {
            i2 = 2;
        }
        if (iP == -1 || i != i2) {
            iP = pqf.p(i2);
        }
        if (iP == 0) {
            return null;
        }
        return Pair.create(Integer.valueOf(iB), Integer.valueOf(iP));
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof bj0)) {
            return false;
        }
        bj0 bj0Var = (bj0) obj;
        return pqf.k(this.a, bj0Var.a) && this.b == bj0Var.b && Objects.equals(this.c, bj0Var.c) && Objects.equals(this.d, bj0Var.d);
    }

    public final int hashCode() {
        return Objects.hashCode(this.d) + ((Objects.hashCode(this.c) + ((pqf.l(this.a) + (this.b * 31)) * 31)) * 31);
    }

    public final String toString() {
        return "AudioCapabilities[maxChannelCount=" + this.b + ", audioProfiles=" + this.a + ", speakerLayoutChannelMasks=" + this.c + ", spatializerChannelMasks=" + this.d + "]";
    }
}
