package com.google.firebase.crashlytics.internal.model;

import defpackage.gv4;
import defpackage.lk9;
import defpackage.mk9;
import defpackage.pj2;
import defpackage.rc5;

/* JADX INFO: compiled from: r8-map-id-c0f90335ad52c1b57db77aaf4b1db5c7c9c2627f2e01f059a43261b6162c0147 */
/* JADX INFO: loaded from: classes3.dex */
public final class AutoCrashlyticsReportEncoder implements pj2 {
    public static final int CODEGEN_VERSION = 2;
    public static final pj2 CONFIG = new AutoCrashlyticsReportEncoder();

    /* JADX INFO: compiled from: r8-map-id-c0f90335ad52c1b57db77aaf4b1db5c7c9c2627f2e01f059a43261b6162c0147 */
    public static final class CrashlyticsReportApplicationExitInfoBuildIdMappingForArchEncoder implements lk9 {
        static final CrashlyticsReportApplicationExitInfoBuildIdMappingForArchEncoder INSTANCE = new CrashlyticsReportApplicationExitInfoBuildIdMappingForArchEncoder();
        private static final rc5 ARCH_DESCRIPTOR = rc5.a("arch");
        private static final rc5 LIBRARYNAME_DESCRIPTOR = rc5.a("libraryName");
        private static final rc5 BUILDID_DESCRIPTOR = rc5.a("buildId");

        private CrashlyticsReportApplicationExitInfoBuildIdMappingForArchEncoder() {
        }

        @Override // defpackage.fv4
        public void encode(CrashlyticsReport.ApplicationExitInfo.BuildIdMappingForArch buildIdMappingForArch, mk9 mk9Var) {
            mk9Var.a(ARCH_DESCRIPTOR, buildIdMappingForArch.getArch());
            mk9Var.a(LIBRARYNAME_DESCRIPTOR, buildIdMappingForArch.getLibraryName());
            mk9Var.a(BUILDID_DESCRIPTOR, buildIdMappingForArch.getBuildId());
        }
    }

    /* JADX INFO: compiled from: r8-map-id-c0f90335ad52c1b57db77aaf4b1db5c7c9c2627f2e01f059a43261b6162c0147 */
    public static final class CrashlyticsReportApplicationExitInfoEncoder implements lk9 {
        static final CrashlyticsReportApplicationExitInfoEncoder INSTANCE = new CrashlyticsReportApplicationExitInfoEncoder();
        private static final rc5 PID_DESCRIPTOR = rc5.a("pid");
        private static final rc5 PROCESSNAME_DESCRIPTOR = rc5.a("processName");
        private static final rc5 REASONCODE_DESCRIPTOR = rc5.a("reasonCode");
        private static final rc5 IMPORTANCE_DESCRIPTOR = rc5.a("importance");
        private static final rc5 PSS_DESCRIPTOR = rc5.a("pss");
        private static final rc5 RSS_DESCRIPTOR = rc5.a("rss");
        private static final rc5 TIMESTAMP_DESCRIPTOR = rc5.a("timestamp");
        private static final rc5 TRACEFILE_DESCRIPTOR = rc5.a("traceFile");
        private static final rc5 BUILDIDMAPPINGFORARCH_DESCRIPTOR = rc5.a("buildIdMappingForArch");

        private CrashlyticsReportApplicationExitInfoEncoder() {
        }

        @Override // defpackage.fv4
        public void encode(CrashlyticsReport.ApplicationExitInfo applicationExitInfo, mk9 mk9Var) {
            mk9Var.e(PID_DESCRIPTOR, applicationExitInfo.getPid());
            mk9Var.a(PROCESSNAME_DESCRIPTOR, applicationExitInfo.getProcessName());
            mk9Var.e(REASONCODE_DESCRIPTOR, applicationExitInfo.getReasonCode());
            mk9Var.e(IMPORTANCE_DESCRIPTOR, applicationExitInfo.getImportance());
            mk9Var.g(PSS_DESCRIPTOR, applicationExitInfo.getPss());
            mk9Var.g(RSS_DESCRIPTOR, applicationExitInfo.getRss());
            mk9Var.g(TIMESTAMP_DESCRIPTOR, applicationExitInfo.getTimestamp());
            mk9Var.a(TRACEFILE_DESCRIPTOR, applicationExitInfo.getTraceFile());
            mk9Var.a(BUILDIDMAPPINGFORARCH_DESCRIPTOR, applicationExitInfo.getBuildIdMappingForArch());
        }
    }

    /* JADX INFO: compiled from: r8-map-id-c0f90335ad52c1b57db77aaf4b1db5c7c9c2627f2e01f059a43261b6162c0147 */
    public static final class CrashlyticsReportCustomAttributeEncoder implements lk9 {
        static final CrashlyticsReportCustomAttributeEncoder INSTANCE = new CrashlyticsReportCustomAttributeEncoder();
        private static final rc5 KEY_DESCRIPTOR = rc5.a("key");
        private static final rc5 VALUE_DESCRIPTOR = rc5.a("value");

        private CrashlyticsReportCustomAttributeEncoder() {
        }

        @Override // defpackage.fv4
        public void encode(CrashlyticsReport.CustomAttribute customAttribute, mk9 mk9Var) {
            mk9Var.a(KEY_DESCRIPTOR, customAttribute.getKey());
            mk9Var.a(VALUE_DESCRIPTOR, customAttribute.getValue());
        }
    }

    /* JADX INFO: compiled from: r8-map-id-c0f90335ad52c1b57db77aaf4b1db5c7c9c2627f2e01f059a43261b6162c0147 */
    public static final class CrashlyticsReportEncoder implements lk9 {
        static final CrashlyticsReportEncoder INSTANCE = new CrashlyticsReportEncoder();
        private static final rc5 SDKVERSION_DESCRIPTOR = rc5.a("sdkVersion");
        private static final rc5 GMPAPPID_DESCRIPTOR = rc5.a("gmpAppId");
        private static final rc5 PLATFORM_DESCRIPTOR = rc5.a("platform");
        private static final rc5 INSTALLATIONUUID_DESCRIPTOR = rc5.a("installationUuid");
        private static final rc5 FIREBASEINSTALLATIONID_DESCRIPTOR = rc5.a("firebaseInstallationId");
        private static final rc5 FIREBASEAUTHENTICATIONTOKEN_DESCRIPTOR = rc5.a("firebaseAuthenticationToken");
        private static final rc5 APPQUALITYSESSIONID_DESCRIPTOR = rc5.a("appQualitySessionId");
        private static final rc5 BUILDVERSION_DESCRIPTOR = rc5.a("buildVersion");
        private static final rc5 DISPLAYVERSION_DESCRIPTOR = rc5.a("displayVersion");
        private static final rc5 SESSION_DESCRIPTOR = rc5.a("session");
        private static final rc5 NDKPAYLOAD_DESCRIPTOR = rc5.a("ndkPayload");
        private static final rc5 APPEXITINFO_DESCRIPTOR = rc5.a("appExitInfo");

        private CrashlyticsReportEncoder() {
        }

        @Override // defpackage.fv4
        public void encode(CrashlyticsReport crashlyticsReport, mk9 mk9Var) {
            mk9Var.a(SDKVERSION_DESCRIPTOR, crashlyticsReport.getSdkVersion());
            mk9Var.a(GMPAPPID_DESCRIPTOR, crashlyticsReport.getGmpAppId());
            mk9Var.e(PLATFORM_DESCRIPTOR, crashlyticsReport.getPlatform());
            mk9Var.a(INSTALLATIONUUID_DESCRIPTOR, crashlyticsReport.getInstallationUuid());
            mk9Var.a(FIREBASEINSTALLATIONID_DESCRIPTOR, crashlyticsReport.getFirebaseInstallationId());
            mk9Var.a(FIREBASEAUTHENTICATIONTOKEN_DESCRIPTOR, crashlyticsReport.getFirebaseAuthenticationToken());
            mk9Var.a(APPQUALITYSESSIONID_DESCRIPTOR, crashlyticsReport.getAppQualitySessionId());
            mk9Var.a(BUILDVERSION_DESCRIPTOR, crashlyticsReport.getBuildVersion());
            mk9Var.a(DISPLAYVERSION_DESCRIPTOR, crashlyticsReport.getDisplayVersion());
            mk9Var.a(SESSION_DESCRIPTOR, crashlyticsReport.getSession());
            mk9Var.a(NDKPAYLOAD_DESCRIPTOR, crashlyticsReport.getNdkPayload());
            mk9Var.a(APPEXITINFO_DESCRIPTOR, crashlyticsReport.getAppExitInfo());
        }
    }

    /* JADX INFO: compiled from: r8-map-id-c0f90335ad52c1b57db77aaf4b1db5c7c9c2627f2e01f059a43261b6162c0147 */
    public static final class CrashlyticsReportFilesPayloadEncoder implements lk9 {
        static final CrashlyticsReportFilesPayloadEncoder INSTANCE = new CrashlyticsReportFilesPayloadEncoder();
        private static final rc5 FILES_DESCRIPTOR = rc5.a("files");
        private static final rc5 ORGID_DESCRIPTOR = rc5.a("orgId");

        private CrashlyticsReportFilesPayloadEncoder() {
        }

        @Override // defpackage.fv4
        public void encode(CrashlyticsReport.FilesPayload filesPayload, mk9 mk9Var) {
            mk9Var.a(FILES_DESCRIPTOR, filesPayload.getFiles());
            mk9Var.a(ORGID_DESCRIPTOR, filesPayload.getOrgId());
        }
    }

    /* JADX INFO: compiled from: r8-map-id-c0f90335ad52c1b57db77aaf4b1db5c7c9c2627f2e01f059a43261b6162c0147 */
    public static final class CrashlyticsReportFilesPayloadFileEncoder implements lk9 {
        static final CrashlyticsReportFilesPayloadFileEncoder INSTANCE = new CrashlyticsReportFilesPayloadFileEncoder();
        private static final rc5 FILENAME_DESCRIPTOR = rc5.a("filename");
        private static final rc5 CONTENTS_DESCRIPTOR = rc5.a("contents");

        private CrashlyticsReportFilesPayloadFileEncoder() {
        }

        @Override // defpackage.fv4
        public void encode(CrashlyticsReport.FilesPayload.File file, mk9 mk9Var) {
            mk9Var.a(FILENAME_DESCRIPTOR, file.getFilename());
            mk9Var.a(CONTENTS_DESCRIPTOR, file.getContents());
        }
    }

    /* JADX INFO: compiled from: r8-map-id-c0f90335ad52c1b57db77aaf4b1db5c7c9c2627f2e01f059a43261b6162c0147 */
    public static final class CrashlyticsReportProfilingManagerInfoEncoder implements lk9 {
        static final CrashlyticsReportProfilingManagerInfoEncoder INSTANCE = new CrashlyticsReportProfilingManagerInfoEncoder();
        private static final rc5 PROFILINGTRIGGER_DESCRIPTOR = rc5.a("profilingTrigger");

        private CrashlyticsReportProfilingManagerInfoEncoder() {
        }

        @Override // defpackage.fv4
        public void encode(CrashlyticsReport.ProfilingManagerInfo profilingManagerInfo, mk9 mk9Var) {
            mk9Var.a(PROFILINGTRIGGER_DESCRIPTOR, profilingManagerInfo.getProfilingTrigger());
        }
    }

    /* JADX INFO: compiled from: r8-map-id-c0f90335ad52c1b57db77aaf4b1db5c7c9c2627f2e01f059a43261b6162c0147 */
    public static final class CrashlyticsReportProfilingManagerInfoProfilingTriggerEncoder implements lk9 {
        static final CrashlyticsReportProfilingManagerInfoProfilingTriggerEncoder INSTANCE = new CrashlyticsReportProfilingManagerInfoProfilingTriggerEncoder();
        private static final rc5 TRIGGER_DESCRIPTOR = rc5.a("trigger");

        private CrashlyticsReportProfilingManagerInfoProfilingTriggerEncoder() {
        }

        @Override // defpackage.fv4
        public void encode(CrashlyticsReport.ProfilingManagerInfo.ProfilingTrigger profilingTrigger, mk9 mk9Var) {
            mk9Var.e(TRIGGER_DESCRIPTOR, profilingTrigger.getTrigger());
        }
    }

    /* JADX INFO: compiled from: r8-map-id-c0f90335ad52c1b57db77aaf4b1db5c7c9c2627f2e01f059a43261b6162c0147 */
    public static final class CrashlyticsReportSessionApplicationEncoder implements lk9 {
        static final CrashlyticsReportSessionApplicationEncoder INSTANCE = new CrashlyticsReportSessionApplicationEncoder();
        private static final rc5 IDENTIFIER_DESCRIPTOR = rc5.a("identifier");
        private static final rc5 VERSION_DESCRIPTOR = rc5.a("version");
        private static final rc5 DISPLAYVERSION_DESCRIPTOR = rc5.a("displayVersion");
        private static final rc5 ORGANIZATION_DESCRIPTOR = rc5.a("organization");
        private static final rc5 INSTALLATIONUUID_DESCRIPTOR = rc5.a("installationUuid");
        private static final rc5 DEVELOPMENTPLATFORM_DESCRIPTOR = rc5.a("developmentPlatform");
        private static final rc5 DEVELOPMENTPLATFORMVERSION_DESCRIPTOR = rc5.a("developmentPlatformVersion");

        private CrashlyticsReportSessionApplicationEncoder() {
        }

        @Override // defpackage.fv4
        public void encode(CrashlyticsReport.Session.Application application, mk9 mk9Var) {
            mk9Var.a(IDENTIFIER_DESCRIPTOR, application.getIdentifier());
            mk9Var.a(VERSION_DESCRIPTOR, application.getVersion());
            mk9Var.a(DISPLAYVERSION_DESCRIPTOR, application.getDisplayVersion());
            mk9Var.a(ORGANIZATION_DESCRIPTOR, application.getOrganization());
            mk9Var.a(INSTALLATIONUUID_DESCRIPTOR, application.getInstallationUuid());
            mk9Var.a(DEVELOPMENTPLATFORM_DESCRIPTOR, application.getDevelopmentPlatform());
            mk9Var.a(DEVELOPMENTPLATFORMVERSION_DESCRIPTOR, application.getDevelopmentPlatformVersion());
        }
    }

    /* JADX INFO: compiled from: r8-map-id-c0f90335ad52c1b57db77aaf4b1db5c7c9c2627f2e01f059a43261b6162c0147 */
    public static final class CrashlyticsReportSessionApplicationOrganizationEncoder implements lk9 {
        static final CrashlyticsReportSessionApplicationOrganizationEncoder INSTANCE = new CrashlyticsReportSessionApplicationOrganizationEncoder();
        private static final rc5 CLSID_DESCRIPTOR = rc5.a("clsId");

        private CrashlyticsReportSessionApplicationOrganizationEncoder() {
        }

        @Override // defpackage.fv4
        public void encode(CrashlyticsReport.Session.Application.Organization organization, mk9 mk9Var) {
            mk9Var.a(CLSID_DESCRIPTOR, organization.getClsId());
        }
    }

    /* JADX INFO: compiled from: r8-map-id-c0f90335ad52c1b57db77aaf4b1db5c7c9c2627f2e01f059a43261b6162c0147 */
    public static final class CrashlyticsReportSessionDeviceEncoder implements lk9 {
        static final CrashlyticsReportSessionDeviceEncoder INSTANCE = new CrashlyticsReportSessionDeviceEncoder();
        private static final rc5 ARCH_DESCRIPTOR = rc5.a("arch");
        private static final rc5 MODEL_DESCRIPTOR = rc5.a("model");
        private static final rc5 CORES_DESCRIPTOR = rc5.a("cores");
        private static final rc5 RAM_DESCRIPTOR = rc5.a("ram");
        private static final rc5 DISKSPACE_DESCRIPTOR = rc5.a("diskSpace");
        private static final rc5 SIMULATOR_DESCRIPTOR = rc5.a("simulator");
        private static final rc5 STATE_DESCRIPTOR = rc5.a("state");
        private static final rc5 MANUFACTURER_DESCRIPTOR = rc5.a("manufacturer");
        private static final rc5 MODELCLASS_DESCRIPTOR = rc5.a("modelClass");

        private CrashlyticsReportSessionDeviceEncoder() {
        }

        @Override // defpackage.fv4
        public void encode(CrashlyticsReport.Session.Device device, mk9 mk9Var) {
            mk9Var.e(ARCH_DESCRIPTOR, device.getArch());
            mk9Var.a(MODEL_DESCRIPTOR, device.getModel());
            mk9Var.e(CORES_DESCRIPTOR, device.getCores());
            mk9Var.g(RAM_DESCRIPTOR, device.getRam());
            mk9Var.g(DISKSPACE_DESCRIPTOR, device.getDiskSpace());
            mk9Var.d(SIMULATOR_DESCRIPTOR, device.isSimulator());
            mk9Var.e(STATE_DESCRIPTOR, device.getState());
            mk9Var.a(MANUFACTURER_DESCRIPTOR, device.getManufacturer());
            mk9Var.a(MODELCLASS_DESCRIPTOR, device.getModelClass());
        }
    }

    /* JADX INFO: compiled from: r8-map-id-c0f90335ad52c1b57db77aaf4b1db5c7c9c2627f2e01f059a43261b6162c0147 */
    public static final class CrashlyticsReportSessionEncoder implements lk9 {
        static final CrashlyticsReportSessionEncoder INSTANCE = new CrashlyticsReportSessionEncoder();
        private static final rc5 GENERATOR_DESCRIPTOR = rc5.a("generator");
        private static final rc5 IDENTIFIER_DESCRIPTOR = rc5.a("identifier");
        private static final rc5 APPQUALITYSESSIONID_DESCRIPTOR = rc5.a("appQualitySessionId");
        private static final rc5 STARTEDAT_DESCRIPTOR = rc5.a("startedAt");
        private static final rc5 ENDEDAT_DESCRIPTOR = rc5.a("endedAt");
        private static final rc5 CRASHED_DESCRIPTOR = rc5.a("crashed");
        private static final rc5 APP_DESCRIPTOR = rc5.a("app");
        private static final rc5 USER_DESCRIPTOR = rc5.a("user");
        private static final rc5 OS_DESCRIPTOR = rc5.a("os");
        private static final rc5 DEVICE_DESCRIPTOR = rc5.a("device");
        private static final rc5 EVENTS_DESCRIPTOR = rc5.a("events");
        private static final rc5 GENERATORTYPE_DESCRIPTOR = rc5.a("generatorType");

        private CrashlyticsReportSessionEncoder() {
        }

        @Override // defpackage.fv4
        public void encode(CrashlyticsReport.Session session, mk9 mk9Var) {
            mk9Var.a(GENERATOR_DESCRIPTOR, session.getGenerator());
            mk9Var.a(IDENTIFIER_DESCRIPTOR, session.getIdentifierUtf8Bytes());
            mk9Var.a(APPQUALITYSESSIONID_DESCRIPTOR, session.getAppQualitySessionId());
            mk9Var.g(STARTEDAT_DESCRIPTOR, session.getStartedAt());
            mk9Var.a(ENDEDAT_DESCRIPTOR, session.getEndedAt());
            mk9Var.d(CRASHED_DESCRIPTOR, session.isCrashed());
            mk9Var.a(APP_DESCRIPTOR, session.getApp());
            mk9Var.a(USER_DESCRIPTOR, session.getUser());
            mk9Var.a(OS_DESCRIPTOR, session.getOs());
            mk9Var.a(DEVICE_DESCRIPTOR, session.getDevice());
            mk9Var.a(EVENTS_DESCRIPTOR, session.getEvents());
            mk9Var.e(GENERATORTYPE_DESCRIPTOR, session.getGeneratorType());
        }
    }

    /* JADX INFO: compiled from: r8-map-id-c0f90335ad52c1b57db77aaf4b1db5c7c9c2627f2e01f059a43261b6162c0147 */
    public static final class CrashlyticsReportSessionEventApplicationEncoder implements lk9 {
        static final CrashlyticsReportSessionEventApplicationEncoder INSTANCE = new CrashlyticsReportSessionEventApplicationEncoder();
        private static final rc5 EXECUTION_DESCRIPTOR = rc5.a("execution");
        private static final rc5 CUSTOMATTRIBUTES_DESCRIPTOR = rc5.a("customAttributes");
        private static final rc5 INTERNALKEYS_DESCRIPTOR = rc5.a("internalKeys");
        private static final rc5 BACKGROUND_DESCRIPTOR = rc5.a("background");
        private static final rc5 CURRENTPROCESSDETAILS_DESCRIPTOR = rc5.a("currentProcessDetails");
        private static final rc5 APPPROCESSDETAILS_DESCRIPTOR = rc5.a("appProcessDetails");
        private static final rc5 UIORIENTATION_DESCRIPTOR = rc5.a("uiOrientation");

        private CrashlyticsReportSessionEventApplicationEncoder() {
        }

        @Override // defpackage.fv4
        public void encode(CrashlyticsReport.Session.Event.Application application, mk9 mk9Var) {
            mk9Var.a(EXECUTION_DESCRIPTOR, application.getExecution());
            mk9Var.a(CUSTOMATTRIBUTES_DESCRIPTOR, application.getCustomAttributes());
            mk9Var.a(INTERNALKEYS_DESCRIPTOR, application.getInternalKeys());
            mk9Var.a(BACKGROUND_DESCRIPTOR, application.getBackground());
            mk9Var.a(CURRENTPROCESSDETAILS_DESCRIPTOR, application.getCurrentProcessDetails());
            mk9Var.a(APPPROCESSDETAILS_DESCRIPTOR, application.getAppProcessDetails());
            mk9Var.e(UIORIENTATION_DESCRIPTOR, application.getUiOrientation());
        }
    }

    /* JADX INFO: compiled from: r8-map-id-c0f90335ad52c1b57db77aaf4b1db5c7c9c2627f2e01f059a43261b6162c0147 */
    public static final class CrashlyticsReportSessionEventApplicationExecutionBinaryImageEncoder implements lk9 {
        static final CrashlyticsReportSessionEventApplicationExecutionBinaryImageEncoder INSTANCE = new CrashlyticsReportSessionEventApplicationExecutionBinaryImageEncoder();
        private static final rc5 BASEADDRESS_DESCRIPTOR = rc5.a("baseAddress");
        private static final rc5 SIZE_DESCRIPTOR = rc5.a("size");
        private static final rc5 NAME_DESCRIPTOR = rc5.a("name");
        private static final rc5 UUID_DESCRIPTOR = rc5.a("uuid");

        private CrashlyticsReportSessionEventApplicationExecutionBinaryImageEncoder() {
        }

        @Override // defpackage.fv4
        public void encode(CrashlyticsReport.Session.Event.Application.Execution.BinaryImage binaryImage, mk9 mk9Var) {
            mk9Var.g(BASEADDRESS_DESCRIPTOR, binaryImage.getBaseAddress());
            mk9Var.g(SIZE_DESCRIPTOR, binaryImage.getSize());
            mk9Var.a(NAME_DESCRIPTOR, binaryImage.getName());
            mk9Var.a(UUID_DESCRIPTOR, binaryImage.getUuidUtf8Bytes());
        }
    }

    /* JADX INFO: compiled from: r8-map-id-c0f90335ad52c1b57db77aaf4b1db5c7c9c2627f2e01f059a43261b6162c0147 */
    public static final class CrashlyticsReportSessionEventApplicationExecutionEncoder implements lk9 {
        static final CrashlyticsReportSessionEventApplicationExecutionEncoder INSTANCE = new CrashlyticsReportSessionEventApplicationExecutionEncoder();
        private static final rc5 THREADS_DESCRIPTOR = rc5.a("threads");
        private static final rc5 EXCEPTION_DESCRIPTOR = rc5.a("exception");
        private static final rc5 APPEXITINFO_DESCRIPTOR = rc5.a("appExitInfo");
        private static final rc5 PROFILINGMANAGERINFO_DESCRIPTOR = rc5.a("profilingManagerInfo");
        private static final rc5 SIGNAL_DESCRIPTOR = rc5.a("signal");
        private static final rc5 BINARIES_DESCRIPTOR = rc5.a("binaries");

        private CrashlyticsReportSessionEventApplicationExecutionEncoder() {
        }

        @Override // defpackage.fv4
        public void encode(CrashlyticsReport.Session.Event.Application.Execution execution, mk9 mk9Var) {
            mk9Var.a(THREADS_DESCRIPTOR, execution.getThreads());
            mk9Var.a(EXCEPTION_DESCRIPTOR, execution.getException());
            mk9Var.a(APPEXITINFO_DESCRIPTOR, execution.getAppExitInfo());
            mk9Var.a(PROFILINGMANAGERINFO_DESCRIPTOR, execution.getProfilingManagerInfo());
            mk9Var.a(SIGNAL_DESCRIPTOR, execution.getSignal());
            mk9Var.a(BINARIES_DESCRIPTOR, execution.getBinaries());
        }
    }

    /* JADX INFO: compiled from: r8-map-id-c0f90335ad52c1b57db77aaf4b1db5c7c9c2627f2e01f059a43261b6162c0147 */
    public static final class CrashlyticsReportSessionEventApplicationExecutionExceptionEncoder implements lk9 {
        static final CrashlyticsReportSessionEventApplicationExecutionExceptionEncoder INSTANCE = new CrashlyticsReportSessionEventApplicationExecutionExceptionEncoder();
        private static final rc5 TYPE_DESCRIPTOR = rc5.a("type");
        private static final rc5 REASON_DESCRIPTOR = rc5.a("reason");
        private static final rc5 FRAMES_DESCRIPTOR = rc5.a("frames");
        private static final rc5 CAUSEDBY_DESCRIPTOR = rc5.a("causedBy");
        private static final rc5 OVERFLOWCOUNT_DESCRIPTOR = rc5.a("overflowCount");

        private CrashlyticsReportSessionEventApplicationExecutionExceptionEncoder() {
        }

        @Override // defpackage.fv4
        public void encode(CrashlyticsReport.Session.Event.Application.Execution.Exception exception, mk9 mk9Var) {
            mk9Var.a(TYPE_DESCRIPTOR, exception.getType());
            mk9Var.a(REASON_DESCRIPTOR, exception.getReason());
            mk9Var.a(FRAMES_DESCRIPTOR, exception.getFrames());
            mk9Var.a(CAUSEDBY_DESCRIPTOR, exception.getCausedBy());
            mk9Var.e(OVERFLOWCOUNT_DESCRIPTOR, exception.getOverflowCount());
        }
    }

    /* JADX INFO: compiled from: r8-map-id-c0f90335ad52c1b57db77aaf4b1db5c7c9c2627f2e01f059a43261b6162c0147 */
    public static final class CrashlyticsReportSessionEventApplicationExecutionSignalEncoder implements lk9 {
        static final CrashlyticsReportSessionEventApplicationExecutionSignalEncoder INSTANCE = new CrashlyticsReportSessionEventApplicationExecutionSignalEncoder();
        private static final rc5 NAME_DESCRIPTOR = rc5.a("name");
        private static final rc5 CODE_DESCRIPTOR = rc5.a("code");
        private static final rc5 ADDRESS_DESCRIPTOR = rc5.a("address");

        private CrashlyticsReportSessionEventApplicationExecutionSignalEncoder() {
        }

        @Override // defpackage.fv4
        public void encode(CrashlyticsReport.Session.Event.Application.Execution.Signal signal, mk9 mk9Var) {
            mk9Var.a(NAME_DESCRIPTOR, signal.getName());
            mk9Var.a(CODE_DESCRIPTOR, signal.getCode());
            mk9Var.g(ADDRESS_DESCRIPTOR, signal.getAddress());
        }
    }

    /* JADX INFO: compiled from: r8-map-id-c0f90335ad52c1b57db77aaf4b1db5c7c9c2627f2e01f059a43261b6162c0147 */
    public static final class CrashlyticsReportSessionEventApplicationExecutionThreadEncoder implements lk9 {
        static final CrashlyticsReportSessionEventApplicationExecutionThreadEncoder INSTANCE = new CrashlyticsReportSessionEventApplicationExecutionThreadEncoder();
        private static final rc5 NAME_DESCRIPTOR = rc5.a("name");
        private static final rc5 IMPORTANCE_DESCRIPTOR = rc5.a("importance");
        private static final rc5 FRAMES_DESCRIPTOR = rc5.a("frames");

        private CrashlyticsReportSessionEventApplicationExecutionThreadEncoder() {
        }

        @Override // defpackage.fv4
        public void encode(CrashlyticsReport.Session.Event.Application.Execution.Thread thread, mk9 mk9Var) {
            mk9Var.a(NAME_DESCRIPTOR, thread.getName());
            mk9Var.e(IMPORTANCE_DESCRIPTOR, thread.getImportance());
            mk9Var.a(FRAMES_DESCRIPTOR, thread.getFrames());
        }
    }

    /* JADX INFO: compiled from: r8-map-id-c0f90335ad52c1b57db77aaf4b1db5c7c9c2627f2e01f059a43261b6162c0147 */
    public static final class CrashlyticsReportSessionEventApplicationExecutionThreadFrameEncoder implements lk9 {
        static final CrashlyticsReportSessionEventApplicationExecutionThreadFrameEncoder INSTANCE = new CrashlyticsReportSessionEventApplicationExecutionThreadFrameEncoder();
        private static final rc5 PC_DESCRIPTOR = rc5.a("pc");
        private static final rc5 SYMBOL_DESCRIPTOR = rc5.a("symbol");
        private static final rc5 FILE_DESCRIPTOR = rc5.a("file");
        private static final rc5 OFFSET_DESCRIPTOR = rc5.a("offset");
        private static final rc5 IMPORTANCE_DESCRIPTOR = rc5.a("importance");

        private CrashlyticsReportSessionEventApplicationExecutionThreadFrameEncoder() {
        }

        @Override // defpackage.fv4
        public void encode(CrashlyticsReport.Session.Event.Application.Execution.Thread.Frame frame, mk9 mk9Var) {
            mk9Var.g(PC_DESCRIPTOR, frame.getPc());
            mk9Var.a(SYMBOL_DESCRIPTOR, frame.getSymbol());
            mk9Var.a(FILE_DESCRIPTOR, frame.getFile());
            mk9Var.g(OFFSET_DESCRIPTOR, frame.getOffset());
            mk9Var.e(IMPORTANCE_DESCRIPTOR, frame.getImportance());
        }
    }

    /* JADX INFO: compiled from: r8-map-id-c0f90335ad52c1b57db77aaf4b1db5c7c9c2627f2e01f059a43261b6162c0147 */
    public static final class CrashlyticsReportSessionEventApplicationProcessDetailsEncoder implements lk9 {
        static final CrashlyticsReportSessionEventApplicationProcessDetailsEncoder INSTANCE = new CrashlyticsReportSessionEventApplicationProcessDetailsEncoder();
        private static final rc5 PROCESSNAME_DESCRIPTOR = rc5.a("processName");
        private static final rc5 PID_DESCRIPTOR = rc5.a("pid");
        private static final rc5 IMPORTANCE_DESCRIPTOR = rc5.a("importance");
        private static final rc5 DEFAULTPROCESS_DESCRIPTOR = rc5.a("defaultProcess");

        private CrashlyticsReportSessionEventApplicationProcessDetailsEncoder() {
        }

        @Override // defpackage.fv4
        public void encode(CrashlyticsReport.Session.Event.Application.ProcessDetails processDetails, mk9 mk9Var) {
            mk9Var.a(PROCESSNAME_DESCRIPTOR, processDetails.getProcessName());
            mk9Var.e(PID_DESCRIPTOR, processDetails.getPid());
            mk9Var.e(IMPORTANCE_DESCRIPTOR, processDetails.getImportance());
            mk9Var.d(DEFAULTPROCESS_DESCRIPTOR, processDetails.isDefaultProcess());
        }
    }

    /* JADX INFO: compiled from: r8-map-id-c0f90335ad52c1b57db77aaf4b1db5c7c9c2627f2e01f059a43261b6162c0147 */
    public static final class CrashlyticsReportSessionEventDeviceEncoder implements lk9 {
        static final CrashlyticsReportSessionEventDeviceEncoder INSTANCE = new CrashlyticsReportSessionEventDeviceEncoder();
        private static final rc5 BATTERYLEVEL_DESCRIPTOR = rc5.a("batteryLevel");
        private static final rc5 BATTERYVELOCITY_DESCRIPTOR = rc5.a("batteryVelocity");
        private static final rc5 PROXIMITYON_DESCRIPTOR = rc5.a("proximityOn");
        private static final rc5 ORIENTATION_DESCRIPTOR = rc5.a("orientation");
        private static final rc5 RAMUSED_DESCRIPTOR = rc5.a("ramUsed");
        private static final rc5 DISKUSED_DESCRIPTOR = rc5.a("diskUsed");

        private CrashlyticsReportSessionEventDeviceEncoder() {
        }

        @Override // defpackage.fv4
        public void encode(CrashlyticsReport.Session.Event.Device device, mk9 mk9Var) {
            mk9Var.a(BATTERYLEVEL_DESCRIPTOR, device.getBatteryLevel());
            mk9Var.e(BATTERYVELOCITY_DESCRIPTOR, device.getBatteryVelocity());
            mk9Var.d(PROXIMITYON_DESCRIPTOR, device.isProximityOn());
            mk9Var.e(ORIENTATION_DESCRIPTOR, device.getOrientation());
            mk9Var.g(RAMUSED_DESCRIPTOR, device.getRamUsed());
            mk9Var.g(DISKUSED_DESCRIPTOR, device.getDiskUsed());
        }
    }

    /* JADX INFO: compiled from: r8-map-id-c0f90335ad52c1b57db77aaf4b1db5c7c9c2627f2e01f059a43261b6162c0147 */
    public static final class CrashlyticsReportSessionEventEncoder implements lk9 {
        static final CrashlyticsReportSessionEventEncoder INSTANCE = new CrashlyticsReportSessionEventEncoder();
        private static final rc5 TIMESTAMP_DESCRIPTOR = rc5.a("timestamp");
        private static final rc5 TYPE_DESCRIPTOR = rc5.a("type");
        private static final rc5 APP_DESCRIPTOR = rc5.a("app");
        private static final rc5 DEVICE_DESCRIPTOR = rc5.a("device");
        private static final rc5 LOG_DESCRIPTOR = rc5.a("log");
        private static final rc5 ROLLOUTS_DESCRIPTOR = rc5.a("rollouts");

        private CrashlyticsReportSessionEventEncoder() {
        }

        @Override // defpackage.fv4
        public void encode(CrashlyticsReport.Session.Event event, mk9 mk9Var) {
            mk9Var.g(TIMESTAMP_DESCRIPTOR, event.getTimestamp());
            mk9Var.a(TYPE_DESCRIPTOR, event.getType());
            mk9Var.a(APP_DESCRIPTOR, event.getApp());
            mk9Var.a(DEVICE_DESCRIPTOR, event.getDevice());
            mk9Var.a(LOG_DESCRIPTOR, event.getLog());
            mk9Var.a(ROLLOUTS_DESCRIPTOR, event.getRollouts());
        }
    }

    /* JADX INFO: compiled from: r8-map-id-c0f90335ad52c1b57db77aaf4b1db5c7c9c2627f2e01f059a43261b6162c0147 */
    public static final class CrashlyticsReportSessionEventLogEncoder implements lk9 {
        static final CrashlyticsReportSessionEventLogEncoder INSTANCE = new CrashlyticsReportSessionEventLogEncoder();
        private static final rc5 CONTENT_DESCRIPTOR = rc5.a("content");

        private CrashlyticsReportSessionEventLogEncoder() {
        }

        @Override // defpackage.fv4
        public void encode(CrashlyticsReport.Session.Event.Log log, mk9 mk9Var) {
            mk9Var.a(CONTENT_DESCRIPTOR, log.getContent());
        }
    }

    /* JADX INFO: compiled from: r8-map-id-c0f90335ad52c1b57db77aaf4b1db5c7c9c2627f2e01f059a43261b6162c0147 */
    public static final class CrashlyticsReportSessionEventRolloutAssignmentEncoder implements lk9 {
        static final CrashlyticsReportSessionEventRolloutAssignmentEncoder INSTANCE = new CrashlyticsReportSessionEventRolloutAssignmentEncoder();
        private static final rc5 ROLLOUTVARIANT_DESCRIPTOR = rc5.a("rolloutVariant");
        private static final rc5 PARAMETERKEY_DESCRIPTOR = rc5.a("parameterKey");
        private static final rc5 PARAMETERVALUE_DESCRIPTOR = rc5.a("parameterValue");
        private static final rc5 TEMPLATEVERSION_DESCRIPTOR = rc5.a("templateVersion");

        private CrashlyticsReportSessionEventRolloutAssignmentEncoder() {
        }

        @Override // defpackage.fv4
        public void encode(CrashlyticsReport.Session.Event.RolloutAssignment rolloutAssignment, mk9 mk9Var) {
            mk9Var.a(ROLLOUTVARIANT_DESCRIPTOR, rolloutAssignment.getRolloutVariant());
            mk9Var.a(PARAMETERKEY_DESCRIPTOR, rolloutAssignment.getParameterKey());
            mk9Var.a(PARAMETERVALUE_DESCRIPTOR, rolloutAssignment.getParameterValue());
            mk9Var.g(TEMPLATEVERSION_DESCRIPTOR, rolloutAssignment.getTemplateVersion());
        }
    }

    /* JADX INFO: compiled from: r8-map-id-c0f90335ad52c1b57db77aaf4b1db5c7c9c2627f2e01f059a43261b6162c0147 */
    public static final class CrashlyticsReportSessionEventRolloutAssignmentRolloutVariantEncoder implements lk9 {
        static final CrashlyticsReportSessionEventRolloutAssignmentRolloutVariantEncoder INSTANCE = new CrashlyticsReportSessionEventRolloutAssignmentRolloutVariantEncoder();
        private static final rc5 ROLLOUTID_DESCRIPTOR = rc5.a("rolloutId");
        private static final rc5 VARIANTID_DESCRIPTOR = rc5.a("variantId");

        private CrashlyticsReportSessionEventRolloutAssignmentRolloutVariantEncoder() {
        }

        @Override // defpackage.fv4
        public void encode(CrashlyticsReport.Session.Event.RolloutAssignment.RolloutVariant rolloutVariant, mk9 mk9Var) {
            mk9Var.a(ROLLOUTID_DESCRIPTOR, rolloutVariant.getRolloutId());
            mk9Var.a(VARIANTID_DESCRIPTOR, rolloutVariant.getVariantId());
        }
    }

    /* JADX INFO: compiled from: r8-map-id-c0f90335ad52c1b57db77aaf4b1db5c7c9c2627f2e01f059a43261b6162c0147 */
    public static final class CrashlyticsReportSessionEventRolloutsStateEncoder implements lk9 {
        static final CrashlyticsReportSessionEventRolloutsStateEncoder INSTANCE = new CrashlyticsReportSessionEventRolloutsStateEncoder();
        private static final rc5 ASSIGNMENTS_DESCRIPTOR = rc5.a("assignments");

        private CrashlyticsReportSessionEventRolloutsStateEncoder() {
        }

        @Override // defpackage.fv4
        public void encode(CrashlyticsReport.Session.Event.RolloutsState rolloutsState, mk9 mk9Var) {
            mk9Var.a(ASSIGNMENTS_DESCRIPTOR, rolloutsState.getRolloutAssignments());
        }
    }

    /* JADX INFO: compiled from: r8-map-id-c0f90335ad52c1b57db77aaf4b1db5c7c9c2627f2e01f059a43261b6162c0147 */
    public static final class CrashlyticsReportSessionOperatingSystemEncoder implements lk9 {
        static final CrashlyticsReportSessionOperatingSystemEncoder INSTANCE = new CrashlyticsReportSessionOperatingSystemEncoder();
        private static final rc5 PLATFORM_DESCRIPTOR = rc5.a("platform");
        private static final rc5 VERSION_DESCRIPTOR = rc5.a("version");
        private static final rc5 BUILDVERSION_DESCRIPTOR = rc5.a("buildVersion");
        private static final rc5 JAILBROKEN_DESCRIPTOR = rc5.a("jailbroken");

        private CrashlyticsReportSessionOperatingSystemEncoder() {
        }

        @Override // defpackage.fv4
        public void encode(CrashlyticsReport.Session.OperatingSystem operatingSystem, mk9 mk9Var) {
            mk9Var.e(PLATFORM_DESCRIPTOR, operatingSystem.getPlatform());
            mk9Var.a(VERSION_DESCRIPTOR, operatingSystem.getVersion());
            mk9Var.a(BUILDVERSION_DESCRIPTOR, operatingSystem.getBuildVersion());
            mk9Var.d(JAILBROKEN_DESCRIPTOR, operatingSystem.isJailbroken());
        }
    }

    /* JADX INFO: compiled from: r8-map-id-c0f90335ad52c1b57db77aaf4b1db5c7c9c2627f2e01f059a43261b6162c0147 */
    public static final class CrashlyticsReportSessionUserEncoder implements lk9 {
        static final CrashlyticsReportSessionUserEncoder INSTANCE = new CrashlyticsReportSessionUserEncoder();
        private static final rc5 IDENTIFIER_DESCRIPTOR = rc5.a("identifier");

        private CrashlyticsReportSessionUserEncoder() {
        }

        @Override // defpackage.fv4
        public void encode(CrashlyticsReport.Session.User user, mk9 mk9Var) {
            mk9Var.a(IDENTIFIER_DESCRIPTOR, user.getIdentifier());
        }
    }

    private AutoCrashlyticsReportEncoder() {
    }

    @Override // defpackage.pj2
    public void configure(gv4 gv4Var) {
        CrashlyticsReportEncoder crashlyticsReportEncoder = CrashlyticsReportEncoder.INSTANCE;
        gv4Var.a(CrashlyticsReport.class, crashlyticsReportEncoder);
        gv4Var.a(AutoValue_CrashlyticsReport.class, crashlyticsReportEncoder);
        CrashlyticsReportSessionEncoder crashlyticsReportSessionEncoder = CrashlyticsReportSessionEncoder.INSTANCE;
        gv4Var.a(CrashlyticsReport.Session.class, crashlyticsReportSessionEncoder);
        gv4Var.a(AutoValue_CrashlyticsReport_Session.class, crashlyticsReportSessionEncoder);
        CrashlyticsReportSessionApplicationEncoder crashlyticsReportSessionApplicationEncoder = CrashlyticsReportSessionApplicationEncoder.INSTANCE;
        gv4Var.a(CrashlyticsReport.Session.Application.class, crashlyticsReportSessionApplicationEncoder);
        gv4Var.a(AutoValue_CrashlyticsReport_Session_Application.class, crashlyticsReportSessionApplicationEncoder);
        CrashlyticsReportSessionApplicationOrganizationEncoder crashlyticsReportSessionApplicationOrganizationEncoder = CrashlyticsReportSessionApplicationOrganizationEncoder.INSTANCE;
        gv4Var.a(CrashlyticsReport.Session.Application.Organization.class, crashlyticsReportSessionApplicationOrganizationEncoder);
        gv4Var.a(AutoValue_CrashlyticsReport_Session_Application_Organization.class, crashlyticsReportSessionApplicationOrganizationEncoder);
        CrashlyticsReportSessionUserEncoder crashlyticsReportSessionUserEncoder = CrashlyticsReportSessionUserEncoder.INSTANCE;
        gv4Var.a(CrashlyticsReport.Session.User.class, crashlyticsReportSessionUserEncoder);
        gv4Var.a(AutoValue_CrashlyticsReport_Session_User.class, crashlyticsReportSessionUserEncoder);
        CrashlyticsReportSessionOperatingSystemEncoder crashlyticsReportSessionOperatingSystemEncoder = CrashlyticsReportSessionOperatingSystemEncoder.INSTANCE;
        gv4Var.a(CrashlyticsReport.Session.OperatingSystem.class, crashlyticsReportSessionOperatingSystemEncoder);
        gv4Var.a(AutoValue_CrashlyticsReport_Session_OperatingSystem.class, crashlyticsReportSessionOperatingSystemEncoder);
        CrashlyticsReportSessionDeviceEncoder crashlyticsReportSessionDeviceEncoder = CrashlyticsReportSessionDeviceEncoder.INSTANCE;
        gv4Var.a(CrashlyticsReport.Session.Device.class, crashlyticsReportSessionDeviceEncoder);
        gv4Var.a(AutoValue_CrashlyticsReport_Session_Device.class, crashlyticsReportSessionDeviceEncoder);
        CrashlyticsReportSessionEventEncoder crashlyticsReportSessionEventEncoder = CrashlyticsReportSessionEventEncoder.INSTANCE;
        gv4Var.a(CrashlyticsReport.Session.Event.class, crashlyticsReportSessionEventEncoder);
        gv4Var.a(AutoValue_CrashlyticsReport_Session_Event.class, crashlyticsReportSessionEventEncoder);
        CrashlyticsReportSessionEventApplicationEncoder crashlyticsReportSessionEventApplicationEncoder = CrashlyticsReportSessionEventApplicationEncoder.INSTANCE;
        gv4Var.a(CrashlyticsReport.Session.Event.Application.class, crashlyticsReportSessionEventApplicationEncoder);
        gv4Var.a(AutoValue_CrashlyticsReport_Session_Event_Application.class, crashlyticsReportSessionEventApplicationEncoder);
        CrashlyticsReportSessionEventApplicationExecutionEncoder crashlyticsReportSessionEventApplicationExecutionEncoder = CrashlyticsReportSessionEventApplicationExecutionEncoder.INSTANCE;
        gv4Var.a(CrashlyticsReport.Session.Event.Application.Execution.class, crashlyticsReportSessionEventApplicationExecutionEncoder);
        gv4Var.a(AutoValue_CrashlyticsReport_Session_Event_Application_Execution.class, crashlyticsReportSessionEventApplicationExecutionEncoder);
        CrashlyticsReportSessionEventApplicationExecutionThreadEncoder crashlyticsReportSessionEventApplicationExecutionThreadEncoder = CrashlyticsReportSessionEventApplicationExecutionThreadEncoder.INSTANCE;
        gv4Var.a(CrashlyticsReport.Session.Event.Application.Execution.Thread.class, crashlyticsReportSessionEventApplicationExecutionThreadEncoder);
        gv4Var.a(AutoValue_CrashlyticsReport_Session_Event_Application_Execution_Thread.class, crashlyticsReportSessionEventApplicationExecutionThreadEncoder);
        CrashlyticsReportSessionEventApplicationExecutionThreadFrameEncoder crashlyticsReportSessionEventApplicationExecutionThreadFrameEncoder = CrashlyticsReportSessionEventApplicationExecutionThreadFrameEncoder.INSTANCE;
        gv4Var.a(CrashlyticsReport.Session.Event.Application.Execution.Thread.Frame.class, crashlyticsReportSessionEventApplicationExecutionThreadFrameEncoder);
        gv4Var.a(AutoValue_CrashlyticsReport_Session_Event_Application_Execution_Thread_Frame.class, crashlyticsReportSessionEventApplicationExecutionThreadFrameEncoder);
        CrashlyticsReportSessionEventApplicationExecutionExceptionEncoder crashlyticsReportSessionEventApplicationExecutionExceptionEncoder = CrashlyticsReportSessionEventApplicationExecutionExceptionEncoder.INSTANCE;
        gv4Var.a(CrashlyticsReport.Session.Event.Application.Execution.Exception.class, crashlyticsReportSessionEventApplicationExecutionExceptionEncoder);
        gv4Var.a(AutoValue_CrashlyticsReport_Session_Event_Application_Execution_Exception.class, crashlyticsReportSessionEventApplicationExecutionExceptionEncoder);
        CrashlyticsReportApplicationExitInfoEncoder crashlyticsReportApplicationExitInfoEncoder = CrashlyticsReportApplicationExitInfoEncoder.INSTANCE;
        gv4Var.a(CrashlyticsReport.ApplicationExitInfo.class, crashlyticsReportApplicationExitInfoEncoder);
        gv4Var.a(AutoValue_CrashlyticsReport_ApplicationExitInfo.class, crashlyticsReportApplicationExitInfoEncoder);
        CrashlyticsReportApplicationExitInfoBuildIdMappingForArchEncoder crashlyticsReportApplicationExitInfoBuildIdMappingForArchEncoder = CrashlyticsReportApplicationExitInfoBuildIdMappingForArchEncoder.INSTANCE;
        gv4Var.a(CrashlyticsReport.ApplicationExitInfo.BuildIdMappingForArch.class, crashlyticsReportApplicationExitInfoBuildIdMappingForArchEncoder);
        gv4Var.a(AutoValue_CrashlyticsReport_ApplicationExitInfo_BuildIdMappingForArch.class, crashlyticsReportApplicationExitInfoBuildIdMappingForArchEncoder);
        CrashlyticsReportProfilingManagerInfoEncoder crashlyticsReportProfilingManagerInfoEncoder = CrashlyticsReportProfilingManagerInfoEncoder.INSTANCE;
        gv4Var.a(CrashlyticsReport.ProfilingManagerInfo.class, crashlyticsReportProfilingManagerInfoEncoder);
        gv4Var.a(AutoValue_CrashlyticsReport_ProfilingManagerInfo.class, crashlyticsReportProfilingManagerInfoEncoder);
        CrashlyticsReportProfilingManagerInfoProfilingTriggerEncoder crashlyticsReportProfilingManagerInfoProfilingTriggerEncoder = CrashlyticsReportProfilingManagerInfoProfilingTriggerEncoder.INSTANCE;
        gv4Var.a(CrashlyticsReport.ProfilingManagerInfo.ProfilingTrigger.class, crashlyticsReportProfilingManagerInfoProfilingTriggerEncoder);
        gv4Var.a(AutoValue_CrashlyticsReport_ProfilingManagerInfo_ProfilingTrigger.class, crashlyticsReportProfilingManagerInfoProfilingTriggerEncoder);
        CrashlyticsReportSessionEventApplicationExecutionSignalEncoder crashlyticsReportSessionEventApplicationExecutionSignalEncoder = CrashlyticsReportSessionEventApplicationExecutionSignalEncoder.INSTANCE;
        gv4Var.a(CrashlyticsReport.Session.Event.Application.Execution.Signal.class, crashlyticsReportSessionEventApplicationExecutionSignalEncoder);
        gv4Var.a(AutoValue_CrashlyticsReport_Session_Event_Application_Execution_Signal.class, crashlyticsReportSessionEventApplicationExecutionSignalEncoder);
        CrashlyticsReportSessionEventApplicationExecutionBinaryImageEncoder crashlyticsReportSessionEventApplicationExecutionBinaryImageEncoder = CrashlyticsReportSessionEventApplicationExecutionBinaryImageEncoder.INSTANCE;
        gv4Var.a(CrashlyticsReport.Session.Event.Application.Execution.BinaryImage.class, crashlyticsReportSessionEventApplicationExecutionBinaryImageEncoder);
        gv4Var.a(AutoValue_CrashlyticsReport_Session_Event_Application_Execution_BinaryImage.class, crashlyticsReportSessionEventApplicationExecutionBinaryImageEncoder);
        CrashlyticsReportCustomAttributeEncoder crashlyticsReportCustomAttributeEncoder = CrashlyticsReportCustomAttributeEncoder.INSTANCE;
        gv4Var.a(CrashlyticsReport.CustomAttribute.class, crashlyticsReportCustomAttributeEncoder);
        gv4Var.a(AutoValue_CrashlyticsReport_CustomAttribute.class, crashlyticsReportCustomAttributeEncoder);
        CrashlyticsReportSessionEventApplicationProcessDetailsEncoder crashlyticsReportSessionEventApplicationProcessDetailsEncoder = CrashlyticsReportSessionEventApplicationProcessDetailsEncoder.INSTANCE;
        gv4Var.a(CrashlyticsReport.Session.Event.Application.ProcessDetails.class, crashlyticsReportSessionEventApplicationProcessDetailsEncoder);
        gv4Var.a(AutoValue_CrashlyticsReport_Session_Event_Application_ProcessDetails.class, crashlyticsReportSessionEventApplicationProcessDetailsEncoder);
        CrashlyticsReportSessionEventDeviceEncoder crashlyticsReportSessionEventDeviceEncoder = CrashlyticsReportSessionEventDeviceEncoder.INSTANCE;
        gv4Var.a(CrashlyticsReport.Session.Event.Device.class, crashlyticsReportSessionEventDeviceEncoder);
        gv4Var.a(AutoValue_CrashlyticsReport_Session_Event_Device.class, crashlyticsReportSessionEventDeviceEncoder);
        CrashlyticsReportSessionEventLogEncoder crashlyticsReportSessionEventLogEncoder = CrashlyticsReportSessionEventLogEncoder.INSTANCE;
        gv4Var.a(CrashlyticsReport.Session.Event.Log.class, crashlyticsReportSessionEventLogEncoder);
        gv4Var.a(AutoValue_CrashlyticsReport_Session_Event_Log.class, crashlyticsReportSessionEventLogEncoder);
        CrashlyticsReportSessionEventRolloutsStateEncoder crashlyticsReportSessionEventRolloutsStateEncoder = CrashlyticsReportSessionEventRolloutsStateEncoder.INSTANCE;
        gv4Var.a(CrashlyticsReport.Session.Event.RolloutsState.class, crashlyticsReportSessionEventRolloutsStateEncoder);
        gv4Var.a(AutoValue_CrashlyticsReport_Session_Event_RolloutsState.class, crashlyticsReportSessionEventRolloutsStateEncoder);
        CrashlyticsReportSessionEventRolloutAssignmentEncoder crashlyticsReportSessionEventRolloutAssignmentEncoder = CrashlyticsReportSessionEventRolloutAssignmentEncoder.INSTANCE;
        gv4Var.a(CrashlyticsReport.Session.Event.RolloutAssignment.class, crashlyticsReportSessionEventRolloutAssignmentEncoder);
        gv4Var.a(AutoValue_CrashlyticsReport_Session_Event_RolloutAssignment.class, crashlyticsReportSessionEventRolloutAssignmentEncoder);
        CrashlyticsReportSessionEventRolloutAssignmentRolloutVariantEncoder crashlyticsReportSessionEventRolloutAssignmentRolloutVariantEncoder = CrashlyticsReportSessionEventRolloutAssignmentRolloutVariantEncoder.INSTANCE;
        gv4Var.a(CrashlyticsReport.Session.Event.RolloutAssignment.RolloutVariant.class, crashlyticsReportSessionEventRolloutAssignmentRolloutVariantEncoder);
        gv4Var.a(AutoValue_CrashlyticsReport_Session_Event_RolloutAssignment_RolloutVariant.class, crashlyticsReportSessionEventRolloutAssignmentRolloutVariantEncoder);
        CrashlyticsReportFilesPayloadEncoder crashlyticsReportFilesPayloadEncoder = CrashlyticsReportFilesPayloadEncoder.INSTANCE;
        gv4Var.a(CrashlyticsReport.FilesPayload.class, crashlyticsReportFilesPayloadEncoder);
        gv4Var.a(AutoValue_CrashlyticsReport_FilesPayload.class, crashlyticsReportFilesPayloadEncoder);
        CrashlyticsReportFilesPayloadFileEncoder crashlyticsReportFilesPayloadFileEncoder = CrashlyticsReportFilesPayloadFileEncoder.INSTANCE;
        gv4Var.a(CrashlyticsReport.FilesPayload.File.class, crashlyticsReportFilesPayloadFileEncoder);
        gv4Var.a(AutoValue_CrashlyticsReport_FilesPayload_File.class, crashlyticsReportFilesPayloadFileEncoder);
    }
}
