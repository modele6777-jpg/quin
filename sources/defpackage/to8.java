package defpackage;

import android.content.Context;
import android.graphics.Point;
import android.media.MediaCodecInfo;
import android.os.Build;
import android.util.Pair;
import android.util.Range;
import com.google.firebase.crashlytics.internal.metadata.UserMetadata;
import java.util.HashMap;
import java.util.HashSet;
import java.util.Objects;

/* JADX INFO: compiled from: r8-map-id-c0f90335ad52c1b57db77aaf4b1db5c7c9c2627f2e01f059a43261b6162c0147 */
/* JADX INFO: loaded from: classes.dex */
public final class to8 {
    public static final u8e m = vtb.r(new bl0(3));
    public final String a;
    public final String b;
    public final String c;
    public final MediaCodecInfo.CodecCapabilities d;
    public final boolean e;
    public final boolean f;
    public final boolean g;
    public final boolean h;
    public final boolean i;
    public int j;
    public int k;
    public float l;

    public to8(String str, String str2, String str3, MediaCodecInfo.CodecCapabilities codecCapabilities, boolean z, boolean z2, boolean z3, boolean z4, boolean z5, boolean z6) {
        str.getClass();
        this.a = str;
        this.b = str2;
        this.c = str3;
        this.d = codecCapabilities;
        this.g = z;
        this.e = z4;
        this.f = z5;
        this.h = z6;
        this.i = qv8.k(str2);
        this.l = -3.4028235E38f;
        this.j = -1;
        this.k = -1;
    }

    public static boolean a(MediaCodecInfo.VideoCapabilities videoCapabilities, int i, int i2, double d) {
        int widthAlignment = videoCapabilities.getWidthAlignment();
        int heightAlignment = videoCapabilities.getHeightAlignment();
        Point point = new Point(pqf.e(i, widthAlignment) * widthAlignment, pqf.e(i2, heightAlignment) * heightAlignment);
        int i3 = point.x;
        int i4 = point.y;
        if (d == -1.0d || d < 1.0d) {
            return videoCapabilities.isSizeSupported(i3, i4);
        }
        double dFloor = Math.floor(d);
        if (!videoCapabilities.areSizeAndRateSupported(i3, i4, dFloor)) {
            return false;
        }
        Range<Double> achievableFrameRatesFor = videoCapabilities.getAchievableFrameRatesFor(i3, i4);
        return achievableFrameRatesFor == null || dFloor <= ((Double) achievableFrameRatesFor.getUpper()).doubleValue();
    }

    /* JADX WARN: Code duplicated, block: B:26:0x0074  */
    public static to8 i(String str, String str2, String str3, MediaCodecInfo.CodecCapabilities codecCapabilities, boolean z, boolean z2, boolean z3) {
        boolean z4;
        boolean zIsFeatureSupported = codecCapabilities.isFeatureSupported("adaptive-playback");
        codecCapabilities.isFeatureSupported("tunneled-playback");
        boolean zIsFeatureSupported2 = codecCapabilities.isFeatureSupported("secure-playback");
        if (Build.VERSION.SDK_INT >= 35 && codecCapabilities.isFeatureSupported("detached-surface")) {
            Integer num = (Integer) m.get();
            if (num != null && num.intValue() <= 202604) {
                String str4 = Build.MANUFACTURER;
                z4 = (str4.equals("Xiaomi") || str4.equals("OPPO") || str4.equals("realme") || str4.equals("motorola") || str4.equals("LENOVO") || str4.equals("Fairphone")) ? false : true;
            }
        }
        return new to8(str, str2, str3, codecCapabilities, z, z2, z3, zIsFeatureSupported, zIsFeatureSupported2, z4);
    }

    public final vm3 b(rr5 rr5Var, rr5 rr5Var2) {
        rr5 rr5Var3;
        rr5 rr5Var4;
        int i;
        String str = rr5Var.p;
        e82 e82Var = rr5Var.H;
        String str2 = rr5Var2.p;
        e82 e82Var2 = rr5Var2.H;
        int i2 = !Objects.equals(str, str2) ? 8 : 0;
        if (this.i) {
            if (rr5Var.C != rr5Var2.C) {
                i2 |= UserMetadata.MAX_ATTRIBUTE_SIZE;
            }
            boolean z = (rr5Var.w == rr5Var2.w && rr5Var.x == rr5Var2.x) ? false : true;
            if (!this.e && z) {
                i2 |= 512;
            }
            if ((!e82.e(e82Var) || !e82.e(e82Var2)) && !Objects.equals(e82Var, e82Var2)) {
                i2 |= 2048;
            }
            HashSet hashSet = pp8.a;
            if (Build.MODEL.startsWith("SM-T230") && "OMX.MARVELL.VIDEO.HW.CODA7542DECODER".equals(this.a) && !rr5Var.b(rr5Var2)) {
                i2 |= 2;
            }
            int i3 = rr5Var.z;
            if (i3 != -1 && (i = rr5Var.A) != -1 && i3 == rr5Var2.z && i == rr5Var2.A && z) {
                i2 |= 2;
            }
            if (i2 == 0 && Objects.equals(rr5Var2.p, "video/dolby-vision")) {
                Pair pairB = d72.b(rr5Var);
                Pair pairB2 = d72.b(rr5Var2);
                if (pairB == null || pairB2 == null || !((Integer) pairB.first).equals(pairB2.first)) {
                    i2 |= 2;
                }
            }
            if (i2 == 0) {
                return new vm3(this.a, rr5Var, rr5Var2, rr5Var.b(rr5Var2) ? 3 : 2, 0);
            }
            rr5Var3 = rr5Var;
            rr5Var4 = rr5Var2;
        } else {
            rr5Var3 = rr5Var;
            rr5Var4 = rr5Var2;
            if (rr5Var3.J != rr5Var4.J) {
                i2 |= 4096;
            }
            if (rr5Var3.L != rr5Var4.L) {
                i2 |= UserMetadata.MAX_INTERNAL_KEY_SIZE;
            }
            if (rr5Var3.M != rr5Var4.M) {
                i2 |= 16384;
            }
            String str3 = this.b;
            if (i2 == 0 && (str3.equals("audio/mp4a-latm") || str3.equals("audio/ac4"))) {
                Pair pairB3 = d72.b(rr5Var3);
                Pair pairB4 = d72.b(rr5Var4);
                if (pairB3 != null && pairB4 != null) {
                    int iIntValue = ((Integer) pairB3.first).intValue();
                    int iIntValue2 = ((Integer) pairB4.first).intValue();
                    if (iIntValue == 42 && iIntValue2 == 42) {
                        return new vm3(this.a, rr5Var3, rr5Var4, 3, 0);
                    }
                    if (str3.equals("audio/ac4") && pairB3.equals(pairB4)) {
                        return new vm3(this.a, rr5Var3, rr5Var4, 3, 0);
                    }
                }
            }
            if (i2 == 0 && (str3.equals("audio/eac3-joc") || str3.equals("audio/eac3"))) {
                return new vm3(this.a, rr5Var3, rr5Var4, 3, 0);
            }
            if (!rr5Var3.b(rr5Var4)) {
                i2 |= 32;
            }
            if ("audio/opus".equals(str3)) {
                i2 |= 2;
            }
            if (i2 == 0) {
                return new vm3(this.a, rr5Var3, rr5Var4, 1, 0);
            }
        }
        return new vm3(this.a, rr5Var3, rr5Var4, 0, i2);
    }

    /* JADX WARN: Code duplicated, block: B:17:0x004e  */
    /* JADX WARN: Code duplicated, block: B:19:0x0053 A[RETURN] */
    /* JADX WARN: Code duplicated, block: B:20:0x0054  */
    /* JADX WARN: Code duplicated, block: B:22:0x006b  */
    /* JADX WARN: Code duplicated, block: B:25:0x0076  */
    /* JADX WARN: Code duplicated, block: B:28:0x007f  */
    /* JADX WARN: Code duplicated, block: B:29:0x0081  */
    /* JADX WARN: Code duplicated, block: B:32:0x0088  */
    /* JADX WARN: Code duplicated, block: B:33:0x008a  */
    /* JADX WARN: Code duplicated, block: B:36:0x0093  */
    /* JADX WARN: Code duplicated, block: B:39:0x0098  */
    /* JADX WARN: Code duplicated, block: B:40:0x009b  */
    /* JADX WARN: Code duplicated, block: B:48:0x00af  */
    /* JADX WARN: Code duplicated, block: B:50:0x00b5  */
    /* JADX WARN: Code duplicated, block: B:53:0x00bd  */
    /* JADX WARN: Code duplicated, block: B:57:0x00c6  */
    /* JADX WARN: Code duplicated, block: B:58:0x00cb  */
    /* JADX WARN: Code duplicated, block: B:61:0x00d0  */
    /* JADX WARN: Code duplicated, block: B:64:0x00e0  */
    /* JADX WARN: Code duplicated, block: B:66:0x00ea  */
    /* JADX WARN: Code duplicated, block: B:69:0x010f  */
    /* JADX WARN: Code duplicated, block: B:71:0x0115  */
    /* JADX WARN: Code duplicated, block: B:90:0x0139 A[ADDED_TO_REGION, REMOVE, SYNTHETIC] */
    /* JADX WARN: Instruction removed from duplicated block: B:20:0x0054, please report this as an issue */
    public final boolean c(Context context, rr5 rr5Var, boolean z) {
        boolean z2;
        int i;
        int i2;
        boolean zEquals;
        String str;
        MediaCodecInfo.CodecCapabilities codecCapabilities;
        MediaCodecInfo.CodecProfileLevel[] codecProfileLevelArr;
        int length;
        int i3;
        MediaCodecInfo.CodecProfileLevel codecProfileLevel;
        MediaCodecInfo.AudioCapabilities audioCapabilities;
        int maxInputChannelCount;
        int i4;
        MediaCodecInfo.CodecProfileLevel[] codecProfileLevelArr2;
        c72 c72VarD = d72.d(rr5Var);
        String str2 = rr5Var.p;
        String str3 = this.c;
        if (str2 != null && str2.equals("video/mv-hevc")) {
            String strL = qv8.l(str3);
            if (!strL.equals("video/mv-hevc")) {
                if (strL.equals("video/hevc")) {
                    HashMap map = ap8.a;
                    String strE = n16.E(rr5Var.s);
                    if (strE == null) {
                        c72VarD = null;
                    } else {
                        String strTrim = strE.trim();
                        String str4 = pqf.a;
                        c72VarD = d72.c(strE, strTrim.split("\\.", -1), rr5Var.H);
                    }
                }
                if (c72VarD != null) {
                    z2 = c72VarD.c;
                    if (!z2) {
                        return false;
                    }
                    pa7.J(z2);
                    i = c72VarD.a;
                    pa7.J(z2);
                    i2 = c72VarD.b;
                    zEquals = "video/dolby-vision".equals(str2);
                    str = this.b;
                    if (zEquals) {
                        str.getClass();
                        switch (str) {
                            case "video/av01":
                            case "video/hevc":
                                i2 = 0;
                                i = 2;
                                break;
                            case "video/avc":
                                i = 8;
                                i2 = 0;
                                break;
                        }
                    }
                    if (this.i) {
                        codecCapabilities = this.d;
                        codecProfileLevelArr = codecCapabilities.profileLevels;
                        if (codecProfileLevelArr == null) {
                            codecProfileLevelArr = new MediaCodecInfo.CodecProfileLevel[0];
                        }
                        if (str.equals("audio/ac4")) {
                            audioCapabilities = codecCapabilities.getAudioCapabilities();
                            if (audioCapabilities != null) {
                                maxInputChannelCount = audioCapabilities.getMaxInputChannelCount();
                            } else {
                                maxInputChannelCount = 2;
                            }
                            if (maxInputChannelCount > 18) {
                            }
                            if (context.getPackageManager().hasSystemFeature("android.hardware.type.automotive")) {
                                codecProfileLevelArr2 = new MediaCodecInfo.CodecProfileLevel[]{ap8.b(1026, i4)};
                            } else {
                                codecProfileLevelArr2 = new MediaCodecInfo.CodecProfileLevel[]{ap8.b(257, i4), ap8.b(513, i4), ap8.b(514, i4), ap8.b(1026, i4), ap8.b(1028, i4)};
                            }
                            codecProfileLevelArr = codecProfileLevelArr2;
                        }
                        length = codecProfileLevelArr.length;
                        for (i3 = 0; i3 < length; i3++) {
                            codecProfileLevel = codecProfileLevelArr[i3];
                            if (codecProfileLevel.profile != i) {
                            }
                        }
                        h("codec.profileLevel, " + rr5Var.l + ", " + str3);
                        return false;
                    }
                    codecCapabilities = this.d;
                    codecProfileLevelArr = codecCapabilities.profileLevels;
                    if (codecProfileLevelArr == null) {
                        codecProfileLevelArr = new MediaCodecInfo.CodecProfileLevel[0];
                    }
                    if (str.equals("audio/ac4")) {
                        audioCapabilities = codecCapabilities.getAudioCapabilities();
                        if (audioCapabilities != null) {
                            maxInputChannelCount = audioCapabilities.getMaxInputChannelCount();
                        } else {
                            maxInputChannelCount = 2;
                        }
                        if (maxInputChannelCount > 18) {
                        }
                        if (context.getPackageManager().hasSystemFeature("android.hardware.type.automotive")) {
                            codecProfileLevelArr2 = new MediaCodecInfo.CodecProfileLevel[]{ap8.b(1026, i4)};
                        } else {
                            codecProfileLevelArr2 = new MediaCodecInfo.CodecProfileLevel[]{ap8.b(257, i4), ap8.b(513, i4), ap8.b(514, i4), ap8.b(1026, i4), ap8.b(1028, i4)};
                        }
                        codecProfileLevelArr = codecProfileLevelArr2;
                    }
                    length = codecProfileLevelArr.length;
                    while (i3 < length) {
                        codecProfileLevel = codecProfileLevelArr[i3];
                        if (codecProfileLevel.profile != i) {
                        }
                    }
                    h("codec.profileLevel, " + rr5Var.l + ", " + str3);
                    return false;
                }
            }
        } else if (c72VarD != null) {
            z2 = c72VarD.c;
            if (!z2) {
                return false;
            }
            pa7.J(z2);
            i = c72VarD.a;
            pa7.J(z2);
            i2 = c72VarD.b;
            zEquals = "video/dolby-vision".equals(str2);
            str = this.b;
            if (zEquals) {
                str.getClass();
                switch (str) {
                    case -1662735862:
                        if (str.equals("video/av01")) {
                        }
                        break;
                    case -1662541442:
                        if (str.equals("video/hevc")) {
                        }
                        break;
                    case 1331836730:
                        if (str.equals("video/avc")) {
                        }
                        break;
                }
                /*  JADX ERROR: Method code generation error
                    java.lang.NullPointerException: Switch insn not found in header
                    	at java.base/java.util.Objects.requireNonNull(Objects.java:246)
                    	at jadx.core.codegen.RegionGen.makeSwitch(RegionGen.java:246)
                    	at jadx.core.dex.regions.SwitchRegion.generate(SwitchRegion.java:90)
                    	at jadx.core.codegen.RegionGen.makeRegion(RegionGen.java:66)
                    	at jadx.core.dex.regions.Region.generate(Region.java:35)
                    	at jadx.core.codegen.RegionGen.makeRegion(RegionGen.java:66)
                    	at jadx.core.codegen.RegionGen.makeRegionIndent(RegionGen.java:83)
                    	at jadx.core.codegen.RegionGen.makeIf(RegionGen.java:126)
                    	at jadx.core.dex.regions.conditions.IfRegion.generate(IfRegion.java:90)
                    	at jadx.core.codegen.RegionGen.makeRegion(RegionGen.java:66)
                    	at jadx.core.dex.regions.Region.generate(Region.java:35)
                    	at jadx.core.codegen.RegionGen.makeRegion(RegionGen.java:66)
                    	at jadx.core.dex.regions.Region.generate(Region.java:35)
                    	at jadx.core.codegen.RegionGen.makeRegion(RegionGen.java:66)
                    	at jadx.core.dex.regions.Region.generate(Region.java:35)
                    	at jadx.core.codegen.RegionGen.makeRegion(RegionGen.java:66)
                    	at jadx.core.codegen.RegionGen.makeRegionIndent(RegionGen.java:83)
                    	at jadx.core.codegen.RegionGen.makeIf(RegionGen.java:126)
                    	at jadx.core.codegen.RegionGen.connectElseIf(RegionGen.java:157)
                    	at jadx.core.codegen.RegionGen.makeIf(RegionGen.java:136)
                    	at jadx.core.dex.regions.conditions.IfRegion.generate(IfRegion.java:90)
                    	at jadx.core.codegen.RegionGen.makeRegion(RegionGen.java:66)
                    	at jadx.core.dex.regions.Region.generate(Region.java:35)
                    	at jadx.core.codegen.RegionGen.makeRegion(RegionGen.java:66)
                    	at jadx.core.codegen.MethodGen.addRegionInsns(MethodGen.java:291)
                    	at jadx.core.codegen.MethodGen.addInstructions(MethodGen.java:270)
                    	at jadx.core.codegen.ClassGen.addMethodCode(ClassGen.java:420)
                    	at jadx.core.codegen.ClassGen.addMethod(ClassGen.java:345)
                    	at jadx.core.codegen.ClassGen.lambda$addInnerClsAndMethods$3(ClassGen.java:299)
                    	at java.base/java.util.stream.ForEachOps$ForEachOp$OfRef.accept(ForEachOps.java:186)
                    	at java.base/java.util.ArrayList.forEach(ArrayList.java:1612)
                    	at java.base/java.util.stream.SortedOps$RefSortingSink.end(SortedOps.java:395)
                    	at java.base/java.util.stream.Sink$ChainedReference.end(Sink.java:261)
                    	at java.base/java.util.stream.ReferencePipeline$7$1FlatMap.end(ReferencePipeline.java:284)
                    	at java.base/java.util.stream.AbstractPipeline.copyInto(AbstractPipeline.java:571)
                    	at java.base/java.util.stream.AbstractPipeline.wrapAndCopyInto(AbstractPipeline.java:560)
                    	at java.base/java.util.stream.ForEachOps$ForEachOp.evaluateSequential(ForEachOps.java:153)
                    	at java.base/java.util.stream.ForEachOps$ForEachOp$OfRef.evaluateSequential(ForEachOps.java:176)
                    	at java.base/java.util.stream.AbstractPipeline.evaluate(AbstractPipeline.java:265)
                    	at java.base/java.util.stream.ReferencePipeline.forEach(ReferencePipeline.java:632)
                    	at jadx.core.codegen.ClassGen.addInnerClsAndMethods(ClassGen.java:295)
                    	at jadx.core.codegen.ClassGen.addClassBody(ClassGen.java:284)
                    	at jadx.core.codegen.ClassGen.addClassBody(ClassGen.java:268)
                    	at jadx.core.codegen.ClassGen.addClassCode(ClassGen.java:160)
                    	at jadx.core.codegen.ClassGen.makeClass(ClassGen.java:104)
                    	at jadx.core.codegen.CodeGen.wrapCodeGen(CodeGen.java:45)
                    	at jadx.core.codegen.CodeGen.generateJavaCode(CodeGen.java:34)
                    	at jadx.core.codegen.CodeGen.generate(CodeGen.java:22)
                    	at jadx.core.ProcessClass.process(ProcessClass.java:89)
                    	at jadx.core.ProcessClass.generateCode(ProcessClass.java:127)
                    	at jadx.core.dex.nodes.ClassNode.generateClassCode(ClassNode.java:405)
                    	at jadx.core.dex.nodes.ClassNode.decompile(ClassNode.java:393)
                    	at jadx.core.dex.nodes.ClassNode.getCode(ClassNode.java:343)
                    */
                /*
                    Method dump skipped, instruction units count: 368
                    To view this dump change 'Code comments level' option to 'DEBUG'
                */
                throw new UnsupportedOperationException("Method not decompiled: defpackage.to8.c(android.content.Context, rr5, boolean):boolean");
            }

            public final boolean d(rr5 rr5Var) {
                return (Objects.equals(rr5Var.p, "audio/flac") && rr5Var.M == 22 && Build.VERSION.SDK_INT < 34 && this.a.equals("c2.android.flac.decoder")) ? false : true;
            }

            public final boolean e(Context context, rr5 rr5Var) {
                int i;
                int i2;
                String str = rr5Var.p;
                String str2 = this.b;
                if ((!str2.equals(str) && !str2.equals(ap8.c(rr5Var))) || !c(context, rr5Var, true) || !d(rr5Var)) {
                    return false;
                }
                if (this.i) {
                    int i3 = rr5Var.w;
                    if (i3 > 0 && (i2 = rr5Var.x) > 0) {
                        return g(i3, i2, rr5Var.B);
                    }
                } else {
                    int i4 = rr5Var.L;
                    MediaCodecInfo.CodecCapabilities codecCapabilities = this.d;
                    if (i4 != -1) {
                        MediaCodecInfo.AudioCapabilities audioCapabilities = codecCapabilities.getAudioCapabilities();
                        if (audioCapabilities == null) {
                            h("sampleRate.aCaps");
                            return false;
                        }
                        if (!audioCapabilities.isSampleRateSupported(i4)) {
                            h("sampleRate.support, " + i4);
                            return false;
                        }
                    }
                    int i5 = rr5Var.J;
                    if (i5 != -1) {
                        MediaCodecInfo.AudioCapabilities audioCapabilities2 = codecCapabilities.getAudioCapabilities();
                        if (audioCapabilities2 == null) {
                            h("channelCount.aCaps");
                            return false;
                        }
                        int maxInputChannelCount = audioCapabilities2.getMaxInputChannelCount();
                        if (maxInputChannelCount <= 1 && maxInputChannelCount <= 0 && !"audio/mpeg".equals(str2) && !"audio/3gpp".equals(str2) && !"audio/amr-wb".equals(str2) && !"audio/mp4a-latm".equals(str2) && !"audio/vorbis".equals(str2) && !"audio/opus".equals(str2) && !"audio/raw".equals(str2) && !"audio/flac".equals(str2) && !"audio/g711-alaw".equals(str2) && !"audio/g711-mlaw".equals(str2) && !"audio/gsm".equals(str2)) {
                            if ("audio/ac3".equals(str2)) {
                                i = 6;
                            } else {
                                i = "audio/eac3".equals(str2) ? 16 : 30;
                            }
                            StringBuilder sbP = ks0.p("AssumedMaxChannelAdjustment: ", this.a, ", [", maxInputChannelCount, " to ");
                            sbP.append(i);
                            sbP.append("]");
                            xo1.V("MediaCodecInfo", sbP.toString());
                            maxInputChannelCount = i;
                        }
                        if (maxInputChannelCount < i5) {
                            h("channelCount.support, " + i5);
                            return false;
                        }
                    }
                }
                return true;
            }

            public final boolean f(rr5 rr5Var) {
                boolean z;
                if (this.i) {
                    return this.e;
                }
                c72 c72VarD = d72.d(rr5Var);
                if (c72VarD == null || !(z = c72VarD.c)) {
                    return false;
                }
                pa7.J(z);
                return c72VarD.a == 42;
            }

            /* JADX WARN: Code duplicated, block: B:24:0x004b A[DONT_INVERT] */
            /* JADX WARN: Code duplicated, block: B:25:0x004d  */
            public final boolean g(int i, int i2, double d) {
                String str;
                Boolean bool;
                MediaCodecInfo.VideoCapabilities videoCapabilities = this.d.getVideoCapabilities();
                if (videoCapabilities == null) {
                    h("sizeAndRate.vCaps");
                    return false;
                }
                int i3 = Build.VERSION.SDK_INT;
                if (i3 >= 29) {
                    int iA = (i3 < 29 || ((bool = vfh.C) != null && bool.booleanValue())) ? 0 : bp.a(videoCapabilities, i, i2, d);
                    if (iA != 2) {
                        if (iA == 1) {
                            StringBuilder sbN = ib8.n(i, i2, "sizeAndRate.cover, ", "x", "@");
                            sbN.append(d);
                            h(sbN.toString());
                            return false;
                        }
                        if (!a(videoCapabilities, i, i2, d)) {
                            if (i < i2) {
                                HashSet hashSet = pp8.a;
                                str = this.a;
                                if ("OMX.MTK.VIDEO.DECODER.HEVC".equals(str)) {
                                    StringBuilder sbN2 = ib8.n(i, i2, "sizeAndRate.rotated, ", "x", "@");
                                    sbN2.append(d);
                                    StringBuilder sbO = ib8.o("AssumedSupport [", sbN2.toString(), "] [", str, ", ");
                                    sbO.append(this.b);
                                    sbO.append("] [");
                                    sbO.append(pqf.a);
                                    sbO.append("]");
                                    xo1.v("MediaCodecInfo", sbO.toString());
                                    return true;
                                }
                                StringBuilder sbN3 = ib8.n(i, i2, "sizeAndRate.rotated, ", "x", "@");
                                sbN3.append(d);
                                StringBuilder sbO2 = ib8.o("AssumedSupport [", sbN3.toString(), "] [", str, ", ");
                                sbO2.append(this.b);
                                sbO2.append("] [");
                                sbO2.append(pqf.a);
                                sbO2.append("]");
                                xo1.v("MediaCodecInfo", sbO2.toString());
                                return true;
                            }
                            StringBuilder sbN4 = ib8.n(i, i2, "sizeAndRate.support, ", "x", "@");
                            sbN4.append(d);
                            h(sbN4.toString());
                            return false;
                        }
                    }
                } else if (!a(videoCapabilities, i, i2, d)) {
                    if (i < i2) {
                        HashSet hashSet2 = pp8.a;
                        str = this.a;
                        if (("OMX.MTK.VIDEO.DECODER.HEVC".equals(str) || !"mcv5a".equals(Build.DEVICE)) && a(videoCapabilities, i2, i, d)) {
                            StringBuilder sbN5 = ib8.n(i, i2, "sizeAndRate.rotated, ", "x", "@");
                            sbN5.append(d);
                            StringBuilder sbO3 = ib8.o("AssumedSupport [", sbN5.toString(), "] [", str, ", ");
                            sbO3.append(this.b);
                            sbO3.append("] [");
                            sbO3.append(pqf.a);
                            sbO3.append("]");
                            xo1.v("MediaCodecInfo", sbO3.toString());
                            return true;
                        }
                    }
                    StringBuilder sbN6 = ib8.n(i, i2, "sizeAndRate.support, ", "x", "@");
                    sbN6.append(d);
                    h(sbN6.toString());
                    return false;
                }
                return true;
            }

            public final void h(String str) {
                StringBuilder sbP = tec.p("NoSupport [", str, "] [");
                sbP.append(this.a);
                sbP.append(", ");
                sbP.append(this.b);
                sbP.append("] [");
                sbP.append(pqf.a);
                sbP.append("]");
                xo1.v("MediaCodecInfo", sbP.toString());
            }

            public final String toString() {
                return this.a;
            }
        }
