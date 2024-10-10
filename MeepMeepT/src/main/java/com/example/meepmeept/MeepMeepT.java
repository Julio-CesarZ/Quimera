package com.example.meepmeept;

import com.acmerobotics.roadrunner.geometry.Pose2d;
import com.acmerobotics.roadrunner.geometry.Vector2d;

import org.rowlandhall.meepmeep.MeepMeep;
import org.rowlandhall.meepmeep.roadrunner.DefaultBotBuilder;
import org.rowlandhall.meepmeep.roadrunner.entity.RoadRunnerBotEntity;

public class MeepMeepT {
    public static void main(String[] args) {
        MeepMeep meepMeep = new MeepMeep(800);

        RoadRunnerBotEntity myBot = new DefaultBotBuilder(meepMeep)
                // Set bot constraints: maxVel, maxAccel, maxAngVel, maxAngAccel, track width
                .setConstraints(41.065033847087705, 41.065033847087705, Math.toRadians(180.98), Math.toRadians(180.98), 10.75)
                .followTrajectorySequence(drive -> drive.trajectorySequenceBuilder(new Pose2d(23.910087572891527, 55.655436300036726, Math.toRadians(-90)))
                        .splineToSplineHeading(new Pose2d(47, 47, Math.toRadians(45)), Math.toRadians(0))

                        .lineTo(new Vector2d(55.00, 53.00))

                        .back(5)

                        .turn(Math.toRadians(135))

                        .splineToLinearHeading(new Pose2d(37.19, 14, Math.toRadians(-90)), Math.toRadians(60))

                        .splineToConstantHeading(new Vector2d(45, 8.5), Math.toRadians(-100))

                        .lineToLinearHeading(new Pose2d(55, 50, Math.toRadians(-135)))

                        .splineToLinearHeading(new Pose2d(43.94, 8, Math.toRadians(-90)), Math.toRadians(90))

                        .lineTo(new Vector2d(57.00, 10))

                        .lineToLinearHeading(new Pose2d(55, 50, Math.toRadians(-135)))

                        .splineToLinearHeading(new Pose2d(28, 5, Math.toRadians(0)), Math.toRadians(180))

                        .build());

        meepMeep.setBackground(MeepMeep.Background.FIELD_INTOTHEDEEP_JUICE_DARK)
                .setDarkMode(true)
                .setBackgroundAlpha(0.95f)
                .addEntity(myBot)
                .start();
    }
}