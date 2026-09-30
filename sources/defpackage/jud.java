package defpackage;

import android.media.AudioDescriptor;
import android.media.AudioDeviceInfo;
import android.media.AudioProfile;
import android.os.Build;
import com.google.firebase.crashlytics.internal.metadata.UserMetadata;
import java.util.ArrayList;
import java.util.Comparator;
import java.util.Iterator;
import java.util.List;
import java.util.TreeSet;

/* JADX INFO: compiled from: r8-map-id-c0f90335ad52c1b57db77aaf4b1db5c7c9c2627f2e01f059a43261b6162c0147 */
/* JADX INFO: loaded from: classes.dex */
public abstract class jud {
    public static final yob a = jy6.s(12);

    public static jy6 a(AudioDeviceInfo audioDeviceInfo) {
        List<AudioProfile> audioProfiles = audioDeviceInfo.getAudioProfiles();
        TreeSet treeSet = new TreeSet(Comparator.comparing(new fj0(0)).reversed());
        for (AudioProfile audioProfile : audioProfiles) {
            if (audioProfile.getEncapsulationType() != 1 && pqf.E(audioProfile.getFormat())) {
                for (int i : audioProfile.getChannelMasks()) {
                    treeSet.add(Integer.valueOf(i));
                }
            }
        }
        return jy6.o(treeSet);
    }

    /* JADX WARN: Code duplicated, block: B:120:0x0181  */
    /* JADX WARN: Code duplicated, block: B:130:0x019e A[RETURN] */
    public static jy6 b(AudioDeviceInfo audioDeviceInfo) {
        int type;
        jy6 jy6VarA;
        jy6 jy6VarO;
        int speakerLayoutChannelMask;
        boolean zM = eb3.M(audioDeviceInfo.getType());
        yob yobVar = a;
        if (!zM) {
            if (audioDeviceInfo.getType() == 1) {
                return jy6.s(4);
            }
            if (audioDeviceInfo.getType() == 2) {
                if (Build.VERSION.SDK_INT >= 36 && (speakerLayoutChannelMask = audioDeviceInfo.getSpeakerLayoutChannelMask()) != 0 && speakerLayoutChannelMask != 1) {
                    return jy6.s(Integer.valueOf(speakerLayoutChannelMask));
                }
                xo1.V("SpeakerLayoutUtil", "Built-in speaker's getSpeakerLayoutChannelMask not usable, defaulting to stereo.");
                return yobVar;
            }
            int i = Build.VERSION.SDK_INT;
            if (i >= 31 && audioDeviceInfo.getType() == 10) {
                jy6 jy6VarA2 = a(audioDeviceInfo);
                if (!jy6VarA2.isEmpty()) {
                    return jy6VarA2;
                }
                jy6 jy6VarK = xq.k(audioDeviceInfo.getAudioDescriptors());
                if (!jy6VarK.isEmpty()) {
                    return jy6VarK;
                }
            } else if (i >= 31) {
                int type2 = audioDeviceInfo.getType();
                if (i >= 31 && type2 == 29) {
                    jy6 jy6VarA3 = a(audioDeviceInfo);
                    if (!jy6VarA3.isEmpty()) {
                        return jy6VarA3;
                    }
                    List<AudioDescriptor> audioDescriptors = audioDeviceInfo.getAudioDescriptors();
                    if (i >= 34) {
                        if (i < 34 || audioDescriptors == null) {
                            ey6 ey6Var = jy6.b;
                            jy6VarO = yob.e;
                        } else {
                            ArrayList arrayList = new ArrayList();
                            Iterator<AudioDescriptor> it = audioDescriptors.iterator();
                            while (it.hasNext()) {
                                AudioDescriptor audioDescriptorC = qc0.c(it.next());
                                if (audioDescriptorC.getStandard() == 2) {
                                    byte[] descriptor = audioDescriptorC.getDescriptor();
                                    if (descriptor.length != 3) {
                                        xo1.V("AudioDescriptorUtil", "Invalid SADB length: " + descriptor.length);
                                    } else {
                                        int i2 = 0;
                                        if (Build.VERSION.SDK_INT >= 34 && descriptor.length == 3) {
                                            byte b = descriptor[0];
                                            i2 = (b & 1) != 0 ? 12 : 0;
                                            if ((b & 2) != 0) {
                                                i2 |= 32;
                                            }
                                            if ((b & 4) != 0) {
                                                i2 |= 16;
                                            }
                                            if ((b & 8) != 0) {
                                                i2 |= 192;
                                            }
                                            if ((b & 16) != 0) {
                                                i2 |= UserMetadata.MAX_ATTRIBUTE_SIZE;
                                            }
                                            if ((b & 32) != 0) {
                                                i2 |= 768;
                                            }
                                            if ((b & 128) != 0) {
                                                i2 |= 201326592;
                                            }
                                            byte b2 = descriptor[1];
                                            if ((b2 & 1) != 0) {
                                                i2 |= 81920;
                                            }
                                            if ((b2 & 2) != 0) {
                                                i2 |= UserMetadata.MAX_INTERNAL_KEY_SIZE;
                                            }
                                            if ((b2 & 4) != 0) {
                                                i2 |= 32768;
                                            }
                                            if ((b2 & 8) != 0) {
                                                i2 |= 6144;
                                            }
                                            if ((b2 & 16) != 0) {
                                                i2 |= 33554432;
                                            }
                                            if ((b2 & 32) != 0) {
                                                i2 |= 262144;
                                            }
                                            if ((b2 & 64) != 0) {
                                                i2 |= 6144;
                                            }
                                            if ((b2 & 128) != 0) {
                                                i2 |= 3145728;
                                            }
                                            byte b3 = descriptor[2];
                                            if ((b3 & 1) != 0) {
                                                i2 |= 655360;
                                            }
                                            if ((b3 & 2) != 0) {
                                                i2 = 8388608 | i2;
                                            }
                                            if ((b3 & 4) != 0) {
                                                i2 |= 20971520;
                                            }
                                        }
                                        arrayList.add(Integer.valueOf(i2));
                                    }
                                }
                            }
                            arrayList.sort(new qu(1));
                            jy6VarO = jy6.o(arrayList);
                        }
                        if (!jy6VarO.isEmpty()) {
                            return jy6VarO;
                        }
                    }
                    jy6 jy6VarK2 = xq.k(audioDescriptors);
                    if (!jy6VarK2.isEmpty()) {
                        return jy6VarK2;
                    }
                } else if (i >= 31 && ((type = audioDeviceInfo.getType()) == 11 || type == 12 || (i >= 31 && type == 22))) {
                    jy6VarA = a(audioDeviceInfo);
                    if (!jy6VarA.isEmpty()) {
                        return jy6VarA;
                    }
                }
            } else if (i >= 31) {
                jy6VarA = a(audioDeviceInfo);
                if (!jy6VarA.isEmpty()) {
                    return jy6VarA;
                }
            }
        }
        return yobVar;
    }
}
