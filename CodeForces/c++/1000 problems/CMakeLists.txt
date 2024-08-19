cmake_minimum_required(VERSION 3.28)
project(1000_problems)

set(CMAKE_CXX_STANDARD 17)

add_executable(sorting
        #sorting/Dragons.cpp
        sorting/MahmoudAndTriangle.cpp)
add_executable(constructive_algorithms
        #constructive_algorithms/OlyaAndGamesWithArrays.cpp
        constructive_algorithms/ShiftsAndSorting.cpp
        constructive_algorithms/AssemblyViaRemainders.cpp
)
